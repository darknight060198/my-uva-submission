#include <iostream>
#include <bitset>
#include <string>
#include <cmath>

using namespace std;

int main () {
	int num1, num2;
	while (cin >> num1 >> num2) {
		string num1Bit = bitset<32>(num1).to_string();
		string num2Bit = bitset<32>(num2).to_string();
		
		int pangkat = 0;
		int res = 0;
		
		for (int i = num1Bit.length()-1; i >= 0; i--) {
			if (num1Bit.at(i) == '0') {
				if (num2Bit.at(i) == '0') {
					
				} else {
					res += pow(2,pangkat);
				}
			} else {
				if (num2Bit.at(i) == '0') {
					res += pow(2,pangkat);
				} else {
					
				}
			}
			pangkat++;
		}
		
		cout << res << endl;
	}
	return 0;
}