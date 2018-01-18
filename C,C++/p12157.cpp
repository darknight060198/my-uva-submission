#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int tc;
    cin >> tc;
    for (int i = 1; i <= tc; i++) {
        int byk, resA = 0, resB = 0;
        cin >> byk;
        for (int j = 0; j < byk; j++) {
            int temp;
            cin >> temp;
            if (temp%30 == 0) {
                resA += (temp/30 + 1)*10;
            } else {
                resA += ((int)ceil(temp/30.0))*10;
            }
            
            if (temp%60 == 0) {
                resB += (temp/60 + 1)*15;
            } else {
                resB += ((int)ceil(temp/60.0))*15;
            }
        }
        
        
        if (resA < resB) cout << "Case " << i << ": Mile " << resA << endl;
        else if (resB < resA) cout << "Case " << i << ": Juice " << resB << endl;
        else cout << "Case " << i << ": Mile Juice " << resA << endl;
    }
    return 0;
}
