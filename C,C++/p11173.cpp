#include <iostream>
using namespace std;

int main() {
	int kasus,n,k;

	cin >> kasus;

	for (int i = 0; i < kasus; i++){
		cin >> n >> k;
		cout << (k^(k>>1)) << endl;
	}

	return 0;
}
