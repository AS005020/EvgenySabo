// bmp_editor.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <stdio.h>
#include <windows.h>
#include <time.h>
#include <string>
#include <iostream>
#include <fstream>

using namespace std;


#pragma pack(2)

//Заголовок файла BMP 
typedef struct tBITMAPFILEHEADER
{
	WORD bfType;
	DWORD bfSize;
	WORD bfReserved1;
	WORD bfReserved2;
	DWORD bfOffBits;
}sFileHead;

//Заголовок BitMap's
typedef struct tBITMAPINFOHEADER
{
	DWORD biSize;
	LONG biWidth;
	LONG biHeight;
	WORD biPlanes;
	WORD biBitCount;
	DWORD biCompression;
	DWORD biSizeImage;
	LONG biXPelsPerMeter;
	LONG biYPelsPerMeter;
	DWORD biClrUsed;
	DWORD biClrImportant;
}sInfoHead;

sFileHead FileHead;
sInfoHead InfoHead;

//Пиксель
struct Color
{
	BYTE red;
	BYTE green;
	BYTE blue;
};
//Размер сетки медианного метода
int med_size = 3;
BYTE* medium_blue = new BYTE[med_size * med_size];
BYTE* medium_green = new BYTE[med_size * med_size];
BYTE* medium_red = new BYTE[med_size * med_size];

//Размер 1-го пикселя
int pixel_size = sizeof(Color);


//1 - BMP, 2 - CMP
int img_type = 0;

//Исходное изображение
Color *src_image = 0;
//Результативное изображение
Color *dst_image = 0;

//Размер изображения
int width = 0;
int height = 0;

//Вывести заголовок BMP файла
void ShowBMPHeaders(tBITMAPFILEHEADER fh, tBITMAPINFOHEADER ih)
{
	cout<<"Type: "<<(CHAR)fh.bfType<<endl;
	cout<<"Size: "<<fh.bfSize<<endl;
	cout<<"Shift of bits: "<<fh.bfOffBits<<endl;
	cout<<"Width: "<<ih.biWidth<<endl;
	cout<<"Height: "<<ih.biHeight<<endl;
	cout<<"Planes: "<<ih.biPlanes<<endl;
	cout<<"BitCount: "<<ih.biBitCount<<endl;
	cout<<"Compression: "<<ih.biCompression<<endl;
}

//Функция для загрузки изображения
bool OpenImage(string path)
{
	ifstream img_file;
	Color temp;
	char buf[3];

	//Открыть файл на чтение
	img_file.open(path.c_str(), ios::in | ios::binary);
	if (!img_file)
	{
		cout<<"File isn`t open!"<<endl;
		return false;
	}

		//Считать заголовки BMP
		img_file.read((char*)&FileHead, sizeof(FileHead));
		img_file.read((char*)&InfoHead, sizeof(InfoHead));
		
		img_type = 1;
		ShowBMPHeaders(FileHead, InfoHead);
		//Присвоить длину и ширину изображения
		width = InfoHead.biWidth;
		height = InfoHead.biHeight;


	//Выделить место под изображение
	src_image = new Color[width*height];

	int i,j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < width; j++)
		{
			img_file.read((char*)&temp, pixel_size);
			src_image[i*width + j] = temp;
		}
		//Дочитать биты используемые для выравнивания до двойного слова
		img_file.read((char*)buf, j%4);
	}
	img_file.close();

	return true;
}

//Функция для сохранения изображение
bool SaveImage(string path)
{
	ofstream img_file;
	char buf[3];

	//Открыть файл на запись
	img_file.open(path.c_str(), ios::out | ios::binary);
	if (!img_file)
	{
		return false;
	}

	img_file.write((char*)&FileHead, sizeof(FileHead));
	img_file.write((char*)&InfoHead, sizeof(InfoHead));
		
	//Скопировать из исходного в результирующее изображение
	if (dst_image == 0)
	{
		dst_image = new Color[width*height];
		memcpy(dst_image, src_image, width*height*sizeof(Color));
	}

	//Записать файл
	int i,j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < width; j++)
		{
			img_file.write((char*)&dst_image[i*width + j], pixel_size);
		}
		img_file.write((char*)buf, j%4);
	}
	img_file.close();

	return true;
}

//Скопировать содержимое результируещего изображения в начальное
void CopyDstToSrc()
{
	if (dst_image != 0)
	{
		memcpy(src_image, dst_image, width*height*sizeof(Color));
	}
}

//Зашумление изображения с заданной долей вероятности
void AddNoise(double probability)
{
	int size = width*height;
	int count = (int)(size*probability)/100;
	int x,y;
	long pos;
	for (int i = 0; i < count; i++)
	{ 
		x = rand()%width;
		y = rand()%height;
		pos = y*width+x; 
		src_image[pos].blue = rand()%256;//255 - white noise
		src_image[pos].green = rand() % 256;//255 - white noise
		src_image[pos].red = rand() % 256;//255 - white noise
	}
	cout<<"Point was added: "<<count<<endl;
}

//Отобразить текущее изображение с помощью вызова стандартного просмотрщика
void ShowImage(string path)
{
	ShowBMPHeaders(FileHead, InfoHead);
	system(path.c_str());
}

//Считать путь к изображению
void ReadPath(string &str)
{
	str.clear();
	cout<<"Enter path to image"<<endl;
	cin>>str;
}

BYTE sort_byte(BYTE* mas, int size) {
	BYTE temp;
	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - i - 1; j++) {
			if (mas[j] > mas[j + 1]) {
				// меняем элементы местами
				temp = mas[j];
				mas[j] = mas[j + 1];
				mas[j + 1] = temp;
			}
		}

	}

	return mas[size/2];
}

void TwoDementionFilter() {
	int size = width * height;
	int count = size;
	long pos;
	for (int y = 1; y < height - 1; y++)
		for (int x = 1; x < width - 1; x++)
		{
			int size_byte = med_size * med_size;
			
			for(int y_i = y - 1, j = 0; y_i < y + 2; y_i++, j++)
				for (int x_i = x - 1, i = 0; x_i < x + 2; x_i++, i++)
				{
					pos = y_i * width + x_i;
					medium_blue[j * med_size + i] = src_image[pos].blue;
					medium_green[j * med_size + i] = src_image[pos].green;
					medium_red[j * med_size + i] = src_image[pos].red;
					
				}
			pos = y * width + x;
			

			src_image[pos].blue = sort_byte(medium_blue, size_byte);
			src_image[pos].green = sort_byte(medium_green, size_byte);
			src_image[pos].red = sort_byte(medium_red, size_byte);
		}

}
void free_img() 
{
	//Освободить память исходного изображения
	if (src_image != 0)
	{
		delete[] src_image;
	}
	//Освободить память результрующего изображения
	if (dst_image != 0)
	{
		delete[] dst_image;
	}
}

void program_interface() 
{
	//Путь к текущему изображению
	string path_to_image, temp;
	bool stop_flag = true;
	int gamma = -1;

		cout << "Меню: " << endl;
		cout << "\tВыход     \t\t ввести 0" << endl;
		cout << "\tЗашумление\t\t ввести 1" << endl;
		cout << "\tФильтрация\t\t ввести 2" << endl;
		int key;
		cin >> key;
		switch (key) {
		case 0:
			stop_flag = false;
			break;
		case 1:
			cout << "Ввести коэффициент зашумления (по умолчанию 15)" << endl;
			cin >> gamma;
			if (gamma == (int)'\n')
				gamma = 15;
			ReadPath(path_to_image);
			OpenImage(path_to_image);
			ShowImage(path_to_image);
			AddNoise(gamma);
			ReadPath(temp);
			SaveImage(temp);
			ShowImage(temp);
			free_img();
			break;
		case 2:
			ReadPath(path_to_image);
			OpenImage(path_to_image);
			ShowImage(path_to_image);
			TwoDementionFilter();
			ReadPath(temp);
			SaveImage(temp);
			ShowImage(temp);
			free_img();
			break;
		default:
			cout << "Некорретный пункт меню" << endl;
		}
}



int main(int argc, char* argv[])
{
	setlocale(LC_ALL, "rus");
	srand((unsigned)time( NULL ));
	program_interface();
	if(medium_blue != 0)
		delete[] medium_blue;
	if(medium_green != 0)
		delete[] medium_green;
	if(medium_red != 0)
		delete[] medium_red;
	return 0;
}


