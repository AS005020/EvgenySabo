#include <iostream>

using namespace std;

int cratno(int n, int a, int b) {
	return n/a + n/b;
}
int main()
{
	cout << cratno(100, 12, 13) << endl;
	return 0;
}