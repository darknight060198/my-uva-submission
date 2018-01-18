#include <iostream>
#include <string>

using namespace std;

int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int location = 0, byk;
        string command;
        cin >> byk;
        bool perintah[byk];
        for (int i = 0; i < byk; i++) {
            cin >> command;
            if (command.compare("LEFT") == 0) {
                perintah[i] = false;
                location--;
            } else if (command.compare("RIGHT") == 0) {
                perintah[i] = true;
                location++;
            } else {
                cin >> command;
                int num;
                cin >> num;
                if (perintah[num-1]) {
                    perintah[i] = true;
                    location++;
                } else {
                    perintah[i] = false;
                    location--;
                }
            }
        }
        
        cout << location << endl;
    }
	return 0;
}
