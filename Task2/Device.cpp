#include "Device.h"

using namespace std;
void Device::enter()
{
	int ch;
	cout << "Enter param value m: ";
	cin >> ch;
	m.set_param(ch);
}

void Device::status()
{
	std::cout << "m :\n\t";
	std::cout << m.to_string_param() << std::endl;
	std::cout << "n :\n\t";
	std::cout << n.to_string_param() << std::endl;
	
}

void Device::change()
{
	cout << "Whould you want change current value: "<<m.get_param()<<" with the step?" << endl;
	if (yes_no()) {
		int step;
		cout << "Enter step: " << endl;
		cin >> step;
		m.change_param(step);
	}
	else
		enter();
}

void Device::border()
{
	int up, down;
	if (m.is_border()) {
		cout << "You want to set new borders?";
		if (!yes_no())
			return;
	}
	cout << "Please set new borders" << endl;
	cout << "Up: ";
	cin >> up;
	cout << "Down: ";
	cin >> down;
	m.set_border_param(up,down);
}

void Device::update()
{
	this->n.set_param(100);
}

char Device::menu()
{
	char ch;
	do {
		//std::cout << "( E)nter m\n";// Enter the element m
		std::cout << "( S)tatus \n";// Display all
		std::cout << "( C)hange m \n";// Change the element m
		std::cout << "( B)order m\n";// Enter border of the  element m
		std::cout << "( Q)uit\n\n";
		std::cout << "Choose command: ";

		std::cin >> ch;
	} while (!strchr("bscq", tolower(ch)));
	return tolower(ch);
}

void Device::start()
{
	char choice;
	for (;;) {

		choice = menu();
		switch (choice) {
		case 'e':	
			enter();
			break;
		case 'b':
			border();
			break;
		case 's':	
			status();
			break;
		case 'c':	
			change();
			break;
		case 'q': 
			return;
		}
	}
}
