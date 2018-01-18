#include <iostream>

using namespace std;

int main() {
	int tc;
	cin >> tc;
	for (int i = 1; i <= tc; i++) {
	    int w,h,l;
	    cin >> w >> h >> l;
	    if (w < 21 && h < 21 && l < 21) {
	        cout << "Case " << i << ": good" << endl;
	    } else {
	        cout << "Case " << i << ": bad" << endl;
	    }
	}
	return 0;
}
