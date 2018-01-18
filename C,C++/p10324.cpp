#include <iostream>
#include <cstring>

using namespace std;

int main() {
    string input;
    int tc = 1;
    while (cin >> input) {
        if (input[0] == '\n') break;
        int byk, i, j;
        cin >> byk;
        cout << "Case " << tc++ << ":" << endl;
        while (byk--) {
            cin >> i >> j;
            if (i > j) {
                int temp = i;
                i = j;
                j = temp;
            }
            bool status = true;
            for (int k = i; k < j; k++) {
                if (input[k] != input[k+1]) {
                    status = false;
                    break;
                }
            }
            
            if (status) cout << "Yes" << endl;
            else cout << "No" << endl;
        }
    }
	return 0;
}
