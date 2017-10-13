#include <iostream>
#include <cmath>
#include <cstring>

using namespace std;

int main() {
    while (true) {
        int high = 10, low = 1, num;
        string tooHigh = "too high";
        string rightOn = "right on";
        cin >> num;
        if (num == 0) break;
        string command;
        getline(cin, command);
        getline(cin, command);
        while (command != rightOn) {
            if (command == tooHigh) {
                high = min(high, num-1); 
            } else {
                low = max(low, num+1);
            }

            cin >> num;
            getline(cin, command);
            getline(cin, command);
        }

        if (num >= low && num <= high) {
            cout << "Stan may be honest" << endl;
        } else {
            cout << "Stan is dishonest" << endl;
        }
    }

    return 0;
}