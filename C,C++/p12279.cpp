#include <iostream>

using namespace std;

int main() {
	int byk, count = 1;
	while (true) {
	    cin >> byk;
	    if (byk == 0) break;
	    int a = 0, b = 0, temp;
	    for (int i = 0; i < byk; i++) {
	        cin >> temp;
	        if (temp == 0) b++;
	        else a++;
	    }
	    
	    cout << "Case " << count++ << ": " << a-b << endl;
	}
	return 0;
}
