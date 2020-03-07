#include <iostream>

using namespace std;

int cratno(int n, int a, int b) {
	int del_min=0;
	int del_max=0;
	int min = (a < b) ? a : b;
	int max = (a < b) ? b : a;
	for (int i = min; i <= n; i+=min)
	{
		del_max += i / (max*(del_max+1));
		del_min++;
	}
	return del_min + del_max;
}
int main()
{
	cout << cratno(2, 3, 6) << endl;
	return 0;
}