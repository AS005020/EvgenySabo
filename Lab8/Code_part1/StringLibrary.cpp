// MathLibrary.cpp : Defines the exported functions for the DLL.
#include "pch.h" // use stdafx.h in Visual Studio 2017 and earlier
#include "StringLibrary.h"
void to_upper(char* str)
{
	for (; *str; str++) {
		if (*str == '¸') *str -= 1;
		else if (*str >= 'a' && *str <= 'ÿ') *str = *str - ('a' - 'A');
		else if (*str >= 'a' && *str <= 'z') *str = *str - ('a' - 'A');
	}
}
