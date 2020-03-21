#include "rectangle.h"
#include "point.h"
#include <iostream>
#include <cmath>
using namespace std;
Rectangle::Rectangle()
{
	this->x_l_bot = 0;
	this->y_l_bot = 0;
	this->x_r_top = 5;
	this->y_r_top = 5;

	this->a = abs(y_l_bot - y_r_top);
	this->b = abs(x_l_bot - x_r_top);

	this->x_l_top = this->x_l_bot;
	this->y_l_top = this->y_r_top;
	this->x_r_bot = this->x_r_top;
	this->y_r_bot = this->y_l_bot;
	countRectangle++;
	commonS += this->square();
}


Rectangle::Rectangle(Point& left, Point& right)
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
	countRectangle++;
	commonS += this->square();
}


Rectangle::Rectangle(Point& left, double a, double b)
{

	this->x_l_bot = left.x;
	this->y_l_bot = left.y;
	this->a = a;
	this->b = b;
	this->x_r_top = this->x_l_bot + b;
	this->y_r_top = this->y_l_bot + a;

	this->x_l_top = this->x_l_bot;
	this->y_l_top = this->y_r_top;
	this->x_r_bot = this->x_r_top;
	this->y_r_bot = this->y_l_bot;
	countRectangle++;
	commonS += this->square();
}

Rectangle::~Rectangle()
{
	countRectangle--;
	commonS -= this->square();
}


double Rectangle::perimeter()
{
	return 2 * (this->a + this->b);
}


double Rectangle::square()
{
	return this->a*this->b;
}


double Rectangle::o_circle()
{
	return sqrt(pow(this->a, 2) + pow(this->b, 2)) / 2;
}

bool Rectangle::is_quadrate()
{
	return (a==b);
}


bool Rectangle::is_belongs(Point& point)
{
	return (point.x >= this->x_l_bot && point.y >= this->y_l_bot && point.x <= x_r_top && point.y <=y_r_top);
}


int Rectangle::get_count()
{
	return countRectangle;
}

double Rectangle::get_commonS()
{
	return commonS;
}

void Rectangle::geometry_change(double a, double b)
{ 
	if (!a || !b) {
		if (!a) cout << "Enter a > 0" << endl;
		if (!b) cout << "Enter b > 0" << endl;
		return;
	}
	this->x_r_top = this->x_l_bot + b;
	this->y_r_top = this->y_l_bot + a;

	this->x_l_top = this->x_l_bot;
	this->y_l_top = this->y_r_top;
	this->x_r_bot = this->x_r_top;
	this->y_r_bot = this->y_l_bot;

	commonS -= this->square();
	this->a = a;
	this->b = b;
	commonS += this->square();
}

void Rectangle::geometry_change(Point& left, Point& right)
{
	this->x_l_bot = left.x;
	this->y_l_bot = left.y;

	this->x_r_top = right.x;
	this->y_r_top = right.y;

	this->x_l_top = this->x_l_bot;
	this->y_l_top = this->y_r_top;
	this->x_r_bot = this->x_r_top;
	this->y_r_bot = this->y_l_bot;
	commonS -= this->square();
	this->a = abs(y_l_bot - y_r_top);
	this->b = abs(x_l_bot - x_r_top);
	commonS += this->square();
}

void Rectangle::redefine_a_b()
{
	commonS -= this->square();
	this->a = abs(y_l_bot - y_r_top);
	this->b = abs(x_l_bot - x_r_top);
	commonS += this->square();
}





double Rectangle::v_circle()
{
	return (this->a == this->b) ? 0 : this->b / 2;
}

ostream& operator<<(ostream& out, Rectangle& rectangle)
{
	out << "a = " << rectangle.a << " b = " << rectangle.b << std::endl
		<< "Top point\t(" << rectangle.x_l_top << ", " << rectangle.y_l_top << ")\t\t\t(" << rectangle.x_r_top << ", " << rectangle.y_r_top << ")" << std::endl
		<< "Bottom point\t(" << rectangle.x_l_bot << ", " << rectangle.y_l_bot << ")\t\t\t(" << rectangle.x_r_bot << ", " << rectangle.y_r_bot << ")" << std::endl
		<< "P = " << rectangle.perimeter() << std::endl
		<< "S = " << rectangle.square() << std::endl
		<< "Inscribed  circle R = " << rectangle.v_circle() << std::endl
		<< "Circumscribed circle R = " << rectangle.o_circle() << std::endl
		<< "Is quadrate: " << (char*)(rectangle.is_quadrate() ? "true" : "false") << std::endl
		<< "Count of rectangles: " << rectangle.get_count() << std::endl
		<< "Common S of rectangles: " << rectangle.get_commonS() << std::endl;

	return out;
}