#include "Factor.h"

long long factor_while(long long a)
{
	long long res = 1;
	for (a; a >= 1; a--) {
		res *= a;
		std::cout << a << std::endl;
	}
	return res;
}
long long factor_rec(long long a)
{
	std::cout << a << std::endl;
	if (a == 0) return 1;
	return a * factor_while(a-1);
}
long long factor_rec_con(long long currNum, long long sum) {
	std::cout << currNum << std::endl;
	if (currNum == 0)
		return sum;

	return factor_rec_con(currNum - 1, sum *= currNum);
}