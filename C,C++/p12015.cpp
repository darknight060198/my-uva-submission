#include <iostream>
#include <deque>
#include <iterator>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int tc , cc = 1;
    cin >> tc;
    while (tc--) {
        int counter = 10, max = 0, inputMax;
        string inputString;
        deque< string > res;
        while (counter--) {
            cin >> inputString >> inputMax;
            if (inputMax > max) {
                res.clear();
                res.push_back(inputString);
                max = inputMax;
            } else if (inputMax == max) {
                if (find(res.begin(), res.end(), inputString) == res.end()) {
                    res.push_back(inputString);
                }
            }
        }
        
        cout << "Case #" << cc++ << ":" << endl;
        deque < string > :: iterator it;
        for (it = res.begin(); it != res.end(); ++it)
        {
            cout << *it << endl;
        }
    }
    return 0;
}
