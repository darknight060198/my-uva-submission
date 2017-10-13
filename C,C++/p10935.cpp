#include <iostream>
#include <deque>
#include <vector>
#include <iterator>

using namespace std;

int main () {
	while (1) {
		int banyakN;
		cin >> banyakN;
		if (banyakN == 0) break;
		
		deque<int> tumpukanDeck;
		vector<int> yangDibuang;
		for (int i = 1; i <= banyakN; i++) {
			tumpukanDeck.push_back(i);
		}
		
		while (tumpukanDeck.size() != 1) {
			int temp = tumpukanDeck.front();
			tumpukanDeck.pop_front();
			yangDibuang.push_back(temp);
			temp = tumpukanDeck.front();
			tumpukanDeck.pop_front();
			tumpukanDeck.push_back(temp);
		}
		
		if (yangDibuang.size() != 0) cout << "Discarded cards: ";
		else cout << "Discarded cards:";
		
		int tempSize = yangDibuang.size();
		int temp = 1;
		
		for (auto i = yangDibuang.begin(); i != yangDibuang.end(); ++i) {
			if (temp != tempSize) {
				cout << *i << ", ";
			} else {
				cout << *i;
			}
			temp++;
		}
		
		cout<<endl;
		
		cout << "Remaining card: ";
		cout << tumpukanDeck.front() << endl;
	}
	return 0;
}