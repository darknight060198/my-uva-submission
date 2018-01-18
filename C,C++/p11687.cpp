42 2 1 1#include <iostream>
#include <cstring>

using namespace std;

int main() {
    string input;
    while (true) {
        cin >> input;
        if (input.compare("END") == 0) break;
        if (input.compare("1") == 0) {
            cout << "1" << endl;
            continue;
        }
        string before = to_string(input.length());
        string after = to_string(before.length());
        int res = 2;
        bool status = true;
        while (status) {
            if (after.compare(before) == 0) {
                status = false;
            } else {
                before = after;
                after = to_string(before.length());
                res++;
            }
        }
        
        cout << res << endl;
    }
	return 0;
}
