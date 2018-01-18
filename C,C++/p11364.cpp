#include <iostream>

using namespace std;

int main () {
	int tc;
	cin >> tc;
	while (tc--) {
		int byk, max = -1, min = 100, temp;
		cin >> byk;
		for (int i = 0; i < byk; i++) {
			cin >> temp;
			if (temp < min) min = temp;
			if (temp > max) max = temp;
		}
		
		cout << 2*(max-min) << endl;
	}
	return 0;
}
