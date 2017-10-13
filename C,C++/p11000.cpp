// UVa 11000 - Bee

#include <iostream>
#include <vector>
using namespace std;

int main() {

	vector<unsigned long long int> fib;
	fib.push_back(1);
	fib.push_back(1);
	fib.push_back(2);
	int m = 2;
	int n;
	cin >> n;
	while (n != -1) {
		while (m <= n+2){
			m++;
			fib.push_back(fib[m-1] + fib[m - 2]);
		}
		cout << fib[n+1]-1 << " " << fib[n+2]-1 << endl;
		cin >> n;
	}

	return 0;
}
