#include "functions.h"

std::string itoa(int i)
{
	int pos = 0;
	std::string buf;
	if (i < 0) {
		buf.insert(buf.begin(), '-');
		pos++;
	}
	int ch = abs(i);
	do {
		char symb = (char)(ch % 10 + 48);
		buf.insert(buf.begin() + pos, symb);
		ch = ch / 10;
	} while (ch > 0);
	return buf;
}

bool yes_no()
{
	char ch;
	do {
		std::cout << "( Y)es/( N)o: ";
		std::cin >> ch;
	} while (!strchr("yn", tolower(ch)));
	if (tolower(ch) == 'y')
		return true;
	return false;
}
