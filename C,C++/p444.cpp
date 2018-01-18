#include <iostream>
#include <string>
#include <algorithm>
//#include <ctype>

using namespace std;

int main () {
	string kalimat;
	while (getline(cin, kalimat)) {
		string res = "";
		int length = kalimat.length();
		if (isdigit(kalimat[0])) {
		    reverse(kalimat.begin(), kalimat.end());
			for (int i = 0; i < length;) {
				string temp;
				if (kalimat[i] == '1') {
					temp = kalimat.substr(i,3);
					i += 3;
				} else {
					temp = kalimat.substr(i,2);
					i += 2;
				}
				
				int temp2 = stoi(temp);
				res += temp2;
			}
			
			cout << res << endl;
		} else {
			for (int i = 0; i < length; i++) {
				res += to_string((int)kalimat[i]);
			}
			
			length = res.length();
			for (int i = length-1; i >= 0; i--) {
				cout << res[i];
			}
			
			cout << endl;
		}
	}
	return 0;
}
