#include <iostream>

using namespace std;

int main () {
	int byk;
	while (cin >> byk) {
		int flip = 0;
		bool flipped;
		int data[byk];
		for (int i = 0; i < byk; i++) {
			cin >> data[i];
		}
		
		do {
		    flipped = false;
			for (int i = 0; i < byk-1; i++) {
				if (data[i] > data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					flip++;
					flipped = true;
				}
			}
		} while (flipped);
		
		cout << "Minimum exchange operations : " << flip << endl;
	}
	return 0;
}
