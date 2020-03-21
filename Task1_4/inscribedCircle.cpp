#include "inscribedCircle.h"

InscribedCircle::InscribedCircle(Rectangle& rectangle)
{
	this->v_circle = rectangle.v_circle();
}

double InscribedCircle::get_v_circle()
{
	return this->v_circle;
}
