#include "rectangle.h"
#include "point.h"
#include <iostream>

using namespace std;
int Rectangle::countRectangle=0;
double Rectangle::commonS;
void create();
void main(){
	create();
	Point a1(-1, -1);
	Point b1(3, 3);
	Rectangle rec1(b1, 6, 7);
	cout << rec1<<endl;
	cout << "Is_belongs: " << rec1.is_belongs(a1) << endl;
	cout << "Count " << rec1.get_count() << endl;
	Rectangle rec2(a1, 6, 7);
	cout << rec2 << endl;
	rec2.geometry_change(3,3);
	cout << rec2 << endl;
}

void create() {
	Point a(-1, -1);
	Point b(3, 3);

	Rectangle rec(b, 6, 7);

    cout << rec << endl;
	cout << "Is_belongs: " << rec.is_belongs(a) << endl;

}