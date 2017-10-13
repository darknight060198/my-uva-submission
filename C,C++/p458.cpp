#include <iostream>
#include <string>

using namespace std;

int main () {
	string input, res;
	while (getline(cin, input)) {
		for (int i = 0; i < input.length(); i++) {
			res += (input.at(i) - 7);
		}
		
		cout << res << endl;
		res = "";
	}
	
	return 0;
}
