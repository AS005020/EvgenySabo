#include "inscribedCircle.h"

InscribedCircle::InscribedCircle(Rectangle& rectangle)
{
	this->o_circle = rectangle.o_circle();
}

double InscribedCircle::get_o_circle()
{
	return this->o_circle;
}
