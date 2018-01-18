#include <iostream>
#include <cstring>
#include <ctype.h>

using namespace std;

int main() {
    string masukan;
    while (true) {
        getline(cin, masukan);
        if (masukan.compare("DONE") == 0) break;
        
        int i = 0, length = masukan.length(), j = length-1;
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
            
            if (tolower(masukan[i]) != tolower(masukan[j])) {
                status = false;
                break;
            }
            i++;
            j--;
        }
        
        if (status) cout << "You won't be eaten!" << endl;
        else cout << "Uh oh.." << endl;
    }
    return 0;
}
