// Spo8.cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//

// StringSpo2.cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//

#include <iostream>
#include <cstring>

#include "StringLibrary.h"


int main()
{
    char* msg = new char[1024];
    std::cout << "Enter string: "; std::cin >> msg;
    to_upper(msg);
    std::cout << msg << std::endl;

}