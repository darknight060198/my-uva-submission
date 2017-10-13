#include <map>
#include <stdio.h>
#include <string>
#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

template<typename Out>
void split(const string &s, char delim, Out result) {
    stringstream ss;
    ss.str(s);
    string item;
    while (getline(ss, item, delim)) {
        *(result++) = item;
    }
}

vector<string> split(const string &s, char delim) {
    vector<std::string> elems;
    split(s, delim, back_inserter(elems));
    return elems;
}

string trim(const string& str)
{
    size_t first = str.find_first_not_of(' ');
    if (string::npos == first)
    {
        return str;
    }
    size_t last = str.find_last_not_of(' ');
    return str.substr(first, (last - first + 1));
}

string tandaBerhenti = ".";

int main () {
	int banyak, kalimat;
	map <string, double> kamus;
	scanf("%d %d", &banyak, &kalimat);
	while (banyak--) {
		string kata;
		double harga;
		cin >> kata >> harga;
		kamus.insert(pair <string, double> (kata,harga));
	}
	
	while (kalimat--) {
		long long int res = 0;
		while (true) {
			string baris;
			getline(cin, baris);
			trim(baris);
			if (baris.compare(tandaBerhenti) == 0) break;
			vector <string> data = split(baris, ' ');
			for (auto it = data.begin(); it != data.end(); ++it) {
				for (auto it2 = kamus.begin(); it2 != kamus.end(); ++it2) {
					if ((*it).compare(it2->first) == 0) {
						res += it2->second;
						break;
					}
				}
			}
		}
		
		cout<< res << endl;
	}
	return 0;
}