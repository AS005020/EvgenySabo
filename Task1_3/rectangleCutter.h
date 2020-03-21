#pragma once
#include "rectangle.h"
#include "point.h"
class RectangleCutter
{
	//(x_l_top,y_l_top) - left top angle
	//(x_r_top,y_r_top) - right top angle
	double x_l_top, x_r_top, y_l_top, y_r_top;
	//(x_l_bot,y_l_bot) - left bottom angle
	//(x_r_bot,y_r_bot) - right bottom angle
	double x_l_bot, x_r_bot, y_l_bot, y_r_bot;
	//sides of Rectangle a(by y), b(by x)
	double a, b;
	//check pont on belongs
	bool is_belongs(Point&);
	double len_bitw_points(Point&, Point&);
public:
	RectangleCutter(Point&, Point&);
	void insertRectangle(Rectangle&);
};

