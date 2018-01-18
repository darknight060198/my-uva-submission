#include <iostream>

using namespace std;

int main() {
    int pjg;
    while (true) {
        cin >> pjg;
        if (pjg == 0) break;
        string address;
        cin >> address;
        int checkTemp = 0;
        int res = pjg, tempRes = 1;
        for (int i = 0; i < pjg; i++) {
            if (address[i] == 'Z') {
                res = 0;
                break;
            }
            if (checkTemp == -1) {
                if (address[i] == 'D') {
                    if (tempRes < res) res = tempRes;
                    tempRes = 1;
                    checkTemp = 1;
                } else if (address[i] == 'R') {
                    tempRes = 1;
                } else {
                    tempRes++;
                }
            } else if (checkTemp == 1) {
                if (address[i] == 'D') {
                    tempRes = 1;
                } else if (address[i] == 'R') {
                    if (tempRes < res) res = tempRes;
                tempRes = 1;
                    checkTemp = -1;
                } else {
                    tempRes++;
                }
            } else {
                if (address[i] == 'D') {
                    checkTemp = 1;
                } else if (address[i] == 'R') {
                    checkTemp = -1;
                }
            }
        }
        
        cout << res << endl;
    }
    return 0;
}
