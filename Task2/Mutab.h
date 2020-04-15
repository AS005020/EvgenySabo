#pragma once
#include <iostream>
class Mutab {	//mutabelniy
	int param;
	int d_border_param, up_border_param;
	bool border_param = false;
public:
	Mutab();
	int get_param();
	void set_param(int param);
	void change_param(int step);
	void set_border_param(int down, int up);
	bool is_border();
	std::string to_string_param();

};