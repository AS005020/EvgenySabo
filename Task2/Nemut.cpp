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
	string buf = string("param: ");
	buf += itoa(this->param);
	return buf;
}
