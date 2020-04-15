#include "Nemut.h"
#include <iostream>
#include <string>

using namespace std;
void Nemut::set_param(int a)
{
	this->param = a;
}
Nemut::Nemut()
{
	set_param(0);

}
int Nemut::get_param()
{
	return this->param;
}

string Nemut::to_string_param()
{
	string buf = string("a: ");
	int last_pos = buf.size();
	if (this->param < 0) {
		buf.insert(buf.begin() + last_pos, '-');
		last_pos++;
	}
	int ch = abs(this->param);
	do {
		char symb = (char)(ch % 10 + 48);
		buf.insert(buf.begin() + last_pos, symb);
		ch = ch / 10;
	} while (ch > 0);
	return buf;
}
