#include <iostream>
#include <cstring>

using namespace std;

int main() {
	int tc, temp, k = 0;
	string masukan;
	cin >> tc;
	while (tc--) {
	    cin >> masukan;
	    if (masukan.compare("donate") == 0) {
	        cin >> temp;
	        k += temp;
	    } else {
	        cout << k << endl;
	    }
	}
	return 0;
}
