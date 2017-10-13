#include <iostream>
#include <string>

using namespace std;

bool alreadyTebak (string c, string temp) {
	if (temp.find(c) != string::npos) {
		return true;
	} else {
		return false;
	}
}

string deleteChar (string tebakan, char c) {
	int length = tebakan.length();
	for (int i = 0; i < length; i++) {
		if (tebakan.at(i) == c) {
			tebakan.erase(i,1);
			i--;
			length--;
		}
	}
	
//	cout << tebakan << endl;
	
	return tebakan;
}

int main () {
	while (true) {
		int kasus;
		cin >> kasus;
		bool menang = false, chicken = false;
		if (kasus == -1) break;
		string kata, tebakan, temp;
		cin >> kata >> tebakan;
		int stroke = 7;
		
		for (int i = 0; i < tebakan.length(); i++) {
			string temp2 = "";
			temp2.push_back(tebakan.at(i));
//			cout << temp2 << endl;
			if (alreadyTebak(temp2, temp)) {
//				cout << "false" << endl;
			} else {
				temp.push_back(tebakan.at(i)); 
//				cout << "true" << endl;
				if (alreadyTebak(temp2 , kata)) {
					kata = deleteChar(kata, tebakan.at(i));
				} else {
					stroke--;
				}
				temp.push_back(tebakan.at(i)); 
			}
			
//			cout << stroke << kata.length() << endl;
			
			if (kata.length() == 0 && stroke > 0) {
				menang = true;
				stroke = 0;
				break;
			} else if (stroke == 0) {
				menang = false;
				break;
			}
			
//			if (stroke == 2 && kata.length() == 2 && (i == tebakan.length()-1)) chicken = true;
//			if (stroke == 0) {
//				chicken = false;
//				menang = false;
//				break;
//			}
//			
//			if (i == tebakan.length()-1) {
//				menang = false;
//			}
		}
		
		if (stroke != 0) chicken = true;
		
		cout << "Round " << kasus << endl;
		
		if (chicken) cout << "You chickened out." << endl;
		else {
			if (menang) cout << "You win." << endl;
			else cout << "You lose." << endl;
		}
	
	}
	return 0;
}
