#include <iostream>
#include <cstring>
#include <iomanip>
#include <ctype.h>

using namespace std;

int getUntilOneDigit(int num) {
    int res = 0;
    while (num > 0) {
        res += num%10;
        num/=10;
    }
    
    if (res > 9) {
        return getUntilOneDigit(res);
    } else {
        return res;
    }
}

int convertToNum(string name) {
    int length = name.length(), res = 0;
    for (int i = 0; i < length; i++) {
        if(isalpha(name[i])) res += ((int)tolower(name[i]))-96;
    }
    return res;
}

int main() {
    string name1, name2;
    while (getline(cin, name1) && getline(cin,name2)) {
        int digit1 = convertToNum(name1), digit2 = convertToNum(name2);
        if (digit1 > 9) {
            digit1 = getUntilOneDigit(digit1);
        }
        if (digit2 > 9) {
            digit2 = getUntilOneDigit(digit2);
        }
        
        if (digit1 > digit2) {
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        
        double res = (digit1*1.0)/(digit2*1.0) * 100;
        
        cout << fixed << setprecision(2) << res << " %" << endl;
    }
	return 0;
}
