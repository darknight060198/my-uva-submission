
#include <iostream>
#include <string>

using namespace std;

int main () {
    string data [] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    int kasus;
    cin >> kasus;
    for (int i = 0; i < kasus; i++) {
        int temp = 0;
        int res = 0;
        string masukan;
        cin >> masukan;
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < masukan.length(); k++) {
                if (data[j].at(k) != masukan.at(k)) temp++;
                if (temp > 1) break;
                if (temp <= 1 && k == masukan.length()-1) res = j+1;
            }
            temp = 0;
        }
        cout << res << endl;
    }
    return 0;
}
