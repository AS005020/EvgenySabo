#pragma once
#include "Mutab.h"
#include "Nemut.h"
class Device {
	Mutab m;
	Nemut n;
	void enter();
	void status();
	void change();
public:
	void update();//may be tread
	char menu();
	void start();
};
