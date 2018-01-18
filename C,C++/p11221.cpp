#include <iostream>
#include <cstring>
#include <ctype.h>
#include <cmath>

using namespace std;

int main() {
    int tc;
    cin >> tc;
    string masukan;
    getline(cin, masukan);
    for (int k = 1; k <= tc; k++) {
        getline(cin, masukan);
        
        cout << k << ". " << masukan << " " << masukan.length() << endl;
        
        int i = 0, length = masukan.length(), j = length-1, total = 0;
        bool status = true;
        
        while (i < j) {
            if (!isalpha(masukan[i])) {
                i++;
                continue;
            }
            
            if (!isalpha(masukan[j])) {
                j--;
                continue;
            }
            
            if (masukan[i] != masukan[j]) {
                status = false;
                break;
            }
            i++;
            j--;
            // if (i == j) total += 1;
            // else total += 2;
            
            total += 2;
            cout << total << " " << i << " " << j << endl;
        }
        
        cout << "Case #" << k << ":" << endl;
        
        cout << total << endl;
        
        if (status) cout << (int)sqrt(total) << endl;
        else cout << "No magic :(" << endl;
    }
    return 0;
}
