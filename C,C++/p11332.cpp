#include <iostream>

using namespace std;

int sumDigit(int);

int main() {
    int input;
    while (true) {
        cin >> input;
        if (input == 0) break;
        else {
            int sum = input;
            while (true) {
                sum = sumDigit(sum);
                if (sum < 10) break;
            }
            cout << sum << endl;
        }
    }
    
    return 0;
}

int sumDigit(int num) {
    int res = 0;
    
    while (num > 9) {
        res += num % 10;
        num /= 10;
    }
    
    res += num;
    
    return res;
}
