#include <iostream>
#include <string>
#include <map>
#include <set>

using namespace std;

int main () {
    bool status = true;
	int tc;
	string masukan;
	cin >> tc;
	getline(cin, masukan);
	
	while (tc--) {
		map<string, int> data;
		set<string> listData;
		
		int totalTumbuhan = 0;
		if (status) {
		    getline(cin, masukan);
		    status = false;
		}
		
		while (true) {
			getline(cin, masukan);
			map<string,int>::iterator it = data.end();
			if (masukan.empty()) break;
			if (data.find(masukan) == it) {
				listData.insert(masukan);
				data.insert(pair<string, int> (masukan, 1));
			} else {
				data.find(masukan)->second++;
			}
			
			totalTumbuhan++;
		}
		
		for (set<string>::iterator i = listData.begin(); i != listData.end(); ++i) {
			string temp = (*i);
			double total = data.find(temp)->second;
			total /= totalTumbuhan;
			total *= 100;
			printf("%s %.4f\n", temp.c_str(), total);
		}
		
		if (tc) printf("\n");
	}
	return 0;
}
