#pragma once
#include "Mutab.h"
#include "Nemut.h"
#include "functions.h"
class Device {
	Mutab m;
	Nemut n;
	void enter();
	void status();
	void change();
	void border();
public:
	void update();//may be tread
	char menu();
	void start();
};
