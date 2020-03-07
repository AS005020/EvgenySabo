#include <iostream>

using namespace std;

void my_swap(int &a, int &b) {
	a = a + b;
	b = a - b;
	a = a - b;
}
int main() {
	int a = 1;
	int b = 3;
	my_swap(a1,b1);
	cout << a1 <<" " << b1 << endl;
	return 0;
}