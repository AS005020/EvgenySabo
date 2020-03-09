#include <iostream>
#include <fstream>
#include <string>


using namespace std;

int file_size(char* name)
{
	ifstream file;
	file.open(name, ios::binary);
	if (file.is_open())
	{
		file.seekg(0, file.end);
		int c = file.tellg();
		c = c + 1;//+ end of file ( i don't know why :(    )
		file.seekg(0, file.beg);
		file.close();
		return c;
	}
	else return 0;
}

bool iron(char* name, int key)
{
	ifstream file;
	ofstream sh_file;
	string sh_name = string("sh") + name;
	string *buf = new string[key];
	int size = file_size(name);

	file.open(name, ios::binary);
	sh_file.open(sh_name, ios::binary | ios::trunc);
	int index = 0;
	bool down = true;
	bool up = false;
	if (file.is_open() && key < size){

		for (int i = 0; i < size-1; i++){
			char ch = file.get();
			
			buf[index]+=ch;
			if (up) index--;
			if (down) index++;
			if (index % (key-1) == 0)
			{
				swap(up, down);
			}
			
			
		}
		
		for (int j = 0; j < key; j++){
			sh_file << buf[j]<<endl;// warning, back part of string (/0/0/0/0/0)
			cout << buf[j];
		}

	file.close();
	sh_file.close();
	return true;
	}
	else return false;
}
int main() {
	setlocale(LC_ALL,"rus");
	iron((char*)"File.txt",4);
	return 0;
}