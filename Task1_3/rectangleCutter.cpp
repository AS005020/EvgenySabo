#include "rectangleCutter.h"
/*#include "point.h"
#include "rectangle.h"*/
#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm> 

bool RectangleCutter::is_belongs(Point& point)
{
	return (point.x >= this->x_l_bot && point.y >= this->y_l_bot && point.x <= x_r_top && point.y <= y_r_top);
}

double RectangleCutter::len_bitw_points(Point& first, Point& second)
{
	return sqrt(pow(abs(second.x - first.x), 2) + pow(abs(second.y - first.y), 2));
}

RectangleCutter::RectangleCutter(Point& left, Point& right)
{
	this->x_l_bot = left.x;
	this->y_l_bot = left.y;

	this->x_r_top = right.x;
	this->y_r_top = right.y;

	this->x_l_top = this->x_l_bot;
	this->y_l_top = this->y_r_top;
	this->x_r_bot = this->x_r_top;
	this->y_r_bot = this->y_l_bot;

	this->a = abs(y_l_bot - y_r_top);
	this->b = abs(x_l_bot - x_r_top);
}

void RectangleCutter::insertRectangle(Rectangle& rectangle)
{
	//				right side									left side							down side						upper side            
	if ((rectangle.x_l_bot > this->x_r_bot) || (rectangle.x_r_bot < this->x_l_bot) || (rectangle.y_l_top < this->y_l_bot) || rectangle.y_l_bot > this->y_l_top)
	{
		//most near ... angle
		Point this_left_bottom(this->x_l_bot, this->y_l_bot);
		Point this_left_top(this->x_l_top, this->y_l_top);
		Point this_right_bottom(this->x_r_bot, this->y_r_bot);
		Point this_right_top(this->x_r_top, this->y_r_top);
		Point mid_rectangle(rectangle.x_l_bot + rectangle.b/2, rectangle.y_l_bot + rectangle.a / 2);
		double len_left_bot = len_bitw_points(mid_rectangle, this_left_bottom);
		double len_left_top = len_bitw_points(mid_rectangle, this_left_top);
		double len_right_bot = len_bitw_points(mid_rectangle, this_right_bottom);
		double len_right_top = len_bitw_points(mid_rectangle, this_right_top);
		vector<double> lens;
		lens.push_back(len_left_bot);//id 0
		lens.push_back(len_left_top);//id 1
		lens.push_back(len_right_bot);//id 2
		lens.push_back(len_right_top);//id 3
		int minElementIndex = std::min_element(lens.begin(), lens.end()) - lens.begin();
		if (minElementIndex == 0) rectangle.geometry_change(this_left_bottom, this_left_bottom);
		else if (minElementIndex == 1) rectangle.geometry_change(this_left_top, this_left_top);
		else if (minElementIndex == 2) rectangle.geometry_change(this_right_bottom, this_right_bottom);
		else rectangle.geometry_change(this_right_top, this_right_top);
		rectangle.redefine_a_b();
	}
	if (rectangle.x_l_bot <= this->x_l_bot) {//left side
		rectangle.x_l_bot = this->x_l_bot;
		rectangle.x_l_top = this->x_l_top;
		rectangle.redefine_a_b();
	}
	if (rectangle.y_l_bot <= this->y_l_bot) {//down side
		rectangle.y_l_bot = this->y_l_bot;
		rectangle.y_r_bot = this->y_r_bot;
		rectangle.redefine_a_b();
	}
	if (rectangle.x_r_top >= this->x_r_top) {//right side
		rectangle.x_r_top = this->x_r_top;
		rectangle.x_r_bot = this->x_r_bot;
		rectangle.redefine_a_b();
	}
	if (rectangle.y_l_top >= this->y_l_top) {//upper side
		rectangle.y_l_top = this->y_l_top;
		rectangle.y_r_top = this->y_r_top;
		rectangle.redefine_a_b();
	}
}	
