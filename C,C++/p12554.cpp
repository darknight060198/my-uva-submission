#include <iostream>

using namespace std;

int byk;
bool isComplete(bool status[]) {
    for (int i = 0; i < byk; i++) {
        if (!status[i]) return false;
    }
    
    return true;
}

int main() {
	string lagu[16];
	lagu[0] = "Happy";
	lagu[1] = "birthday";
	lagu[2] = "to";
	lagu[3] = "you";
	lagu[4] = "Happy";
	lagu[5] = "birthday";
	lagu[6] = "to";
	lagu[7] = "you";
	lagu[8] = "Happy";
	lagu[9] = "birthday";
	lagu[10] = "to";
	lagu[11] = "Rujia";
	lagu[12] = "Happy";
	lagu[13] = "birthday";
	lagu[14] = "to";
	lagu[15] = "you";
	
	cin >> byk;
	string nama[byk];
	bool status[byk];
	for (int i = 0; i < byk; i++) {
	    cin >> nama[i];
	    status[i] = false;
	}
	int j = 0;
	do {
	    for (int i = 0; i < 16; i++) {
	        if (j == byk) j = 0;
	        status[j] = true;
	        cout << nama[j++] << ": " << lagu[i] << endl;
	    }
	} while (!isComplete(status));
	
	return 0;
}
