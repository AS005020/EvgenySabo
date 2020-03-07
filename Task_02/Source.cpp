#include <iostream>

using namespace std;

template <class T>
void my_swap(T& a, T& b) {
	a = a + b;
	b = a - b;
	a = a - b;
}
void my_swap(bool& a, bool& b) {
}
int main() {
	bool a1 = true;
	bool b1= false;
	my_swap(a1,b1);
	cout << a1 <<" " << b1 << endl;

	return 0;
}