#pragma once
#include "point.h"

#include <iostream>
using namespace std;


class Rectangle {

	static int countRectangle;
	static double commonS;
public:
	
	//(x_l_top,y_l_top) - left top angle
	//(x_r_top,y_r_top) - right top angle
	double x_l_top, x_r_top, y_l_top, y_r_top;
	//(x_l_bot,y_l_bot) - left bottom angle
	//(x_r_bot,y_r_bot) - right bottom angle
	double x_l_bot, x_r_bot, y_l_bot, y_r_bot;
	//sides of Rectangle a(by y), b(by x)
	double a, b;
	Rectangle();
	//by two point
	Rectangle(Point& l, Point& r);
	//by left bottom angle and by sides a, b
	Rectangle(Point& left, double a, double b);
	~Rectangle();
	double perimeter();
	double square();
	//radius inscribed circle
	double v_circle();
	//radius circumscribed circle
	double o_circle();
	//check on quadrate
	bool is_quadrate();
	//check pont on belongs
	bool is_belongs(Point& point);
	//take static count
	int get_count();
	//take static S
	double get_commonS();
	//change rectangle by left bottom point and by two sides
	void geometry_change(double a = 0, double b = 0);
	void geometry_change(Point&, Point&);
	//for check
	friend ostream& operator<<(ostream& ,Rectangle&);

	//redefine a and b
	void redefine_a_b();
};


