#pragma once
#include <iostream>
class Nemut {	//mutabelniy
	int param;
public:
	Nemut();
	int get_param();
	void set_param(int a);
	std::string to_string_param();

};