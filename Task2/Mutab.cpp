#include "Mutab.h"

#include <iostream>
#include <cstring>

using namespace std;
Mutab::Mutab()
{
	set_param(0);

}
int Mutab::get_param()
{
	return this->param;
}


void Mutab::set_param(int a)
{
	if (is_border())
		if (a >= d_border_param && a <= up_border_param)
			this->param = a;
		else
			cout << "Unable to set outgoing value" << endl;
	
	else
		this->param = a;
}

void Mutab::change_param(int step)
{
	char ch;
	for (;;) {
		
		cout << "Enter + or - \n\t(for quite enter anything else):" <<endl;
		cin >> ch;
		if (!strchr("+-", tolower(ch)))
			return;	
		if (ch == '+')
			set_param(this->param + step);
		else
			set_param(this->param - step);
		cout << "Current value: " << this->get_param() << endl;
	} 
}

void Mutab::set_border_param(int down, int up)
{
	if (up < down)
		swap(up, down);

	this->d_border_param = down;
	this->up_border_param = up;
	this->border_param = true;

	if (!(d_border_param <= param && param <= up_border_param)) { // if value outgoing from the new border
		if (param - d_border_param < param - up_border_param)
			set_param(d_border_param);
		else
			set_param(up_border_param);
	}

}

bool Mutab::is_border()
{
	return border_param;
}

string Mutab::to_string_param()
{
	string buf = string("param: ");
	buf += itoa(this->param);
	if (border_param)
		buf += " having the border from " + itoa(d_border_param) + " to " + itoa(up_border_param);
	return buf;
	
}
