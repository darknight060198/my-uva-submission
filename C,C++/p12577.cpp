#include <iostream>
#include <cstring>

using namespace std;

int main() {
    int tc = 1;
    string masukan;
    while (true) {
        cin >> masukan;
        if (masukan.compare("*") == 0) {
            break;
        } else if (masukan.compare("Hajj") == 0) {
            cout << "Case " << tc++ << ": Hajj-e-Akbar" << endl;
        } else {
            cout << "Case " << tc++ << ": Hajj-e-Asghar" << endl;
        }
    }
	return 0;
}
