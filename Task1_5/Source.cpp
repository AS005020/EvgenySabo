#include <windows.h>
#include <iostream>
#include <ctime>
#include "Factor.h"

using namespace std;

long long  a = 13;
int main()
{
    clock_t start, end;
    long double seconds;
    start = clock();
    factor_while(a);
    end = clock();

    seconds = (long double)(end - start) / CLOCKS_PER_SEC;
    cout << endl;
    cout << seconds << endl;
    
    
    start = clock();
    factor_rec(a);
    end = clock();
    seconds = (long double)(end - start) / CLOCKS_PER_SEC;
    cout << endl;
    cout << seconds << "\n";*/
    
    start = clock();
    factor_rec_con(a);
    end = clock();
    seconds = (long double)(end - start) / CLOCKS_PER_SEC;
    cout << seconds << "\n";
    return 0;
}
