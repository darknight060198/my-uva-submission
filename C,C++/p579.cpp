#include <iostream>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main () {
	char input[6];
	while (true) {
		cin.getline(input,6);
		int data[2];
		int i = 0;
		char *pch = strtok(input, ":");
		while (pch != NULL && i < 2) {
			data[i++] = stoi(pch);
			pch = strtok(NULL, ":");
		}
		
		if (data[0] == 0 && data[1] == 0) break;
		double derajatJam, derajatMenit;
		derajatJam = (data[0] * 30.0) + (data[1]/60.0*30.0);
		derajatMenit = data[1] * 6.0;

        if (abs(derajatJam-derajatMenit) > 180) cout << fixed << setprecision(3) << 360-abs(derajatJam-derajatMenit) << endl;
		else cout << fixed << setprecision(3) << abs(derajatJam-derajatMenit) << endl;
	}
	return 0;
}
