#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

template <class T>
vector<pair<T, T>> train(T s, T a1, T a2, T v) {
	//metrs, sec
	T t_result;
	T max_t_a1 = v / a1;
	T max_t_a2 = v / a2;
	T s_mid = (a1 * pow(max_t_a1, 2) / 2) + (a2 * pow(max_t_a2, 2) / 2);//s1 + s2
	if (s_mid <= s)
	{
		s = s - s_mid;//ride with max v
		t_result = 2 * s / v + max_t_a1 + max_t_a2;
		
	}
	else{

		v = sqrt(s * (2 * a1 * 2 * a2)/(2 * a1 + 2 * a2));// s = s1 + s2  v1=v2 
		t_result = v / a1 + v / a2;//t = t1 + t2
	}
	vector<pair<T, T>> res;
	res.push_back(make_pair(t_result, v));
	return res;
}
int main()
{
	auto T = train(100.0, 0.1, 0.2, 10.0);
	cout <<"t = " << T[0].first << " \nV(max) = " << T[0].second << endl;

	return 0;
}

