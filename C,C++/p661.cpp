#include <iostream>

using namespace std;

int main() {
    int n, m, c, seq = 1;
    while (true) {
        cin >> n >> m >> c;
        if (n==0&&m==0&&c==0) break;
        int device[n];
        bool status[n];
        for (int i = 0; i < n; i++) {
            cin >> device[i];
            status[i] = false;
        }
        bool isBlown = false;
        int max = 0, curr = 0;
        for (int i = 0; i < m; i++) {
            int num;
            cin >> num;
            if (isBlown) continue;
            if (status[num-1]) {
                status[num-1] = false;
                curr -= device[num-1];
            } else {
                status[num-1] = true;
                curr += device[num-1];
            }
            if (curr > max) max = curr;
            
            if (curr > c) {
                isBlown = true;
            }
        }
        
        if (isBlown) cout << "Sequence " << seq++ << endl << "Fuse was blown." << endl;
        else cout << "Sequence " << seq++ << endl << "Fuse was not blown.\nMaximal power consumption was " << max << " amperes." << endl;
        
        cout << endl;
    }
    return 0;
}
