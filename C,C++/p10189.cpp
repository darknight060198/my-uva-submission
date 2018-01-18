#include <iostream>
#include <algorithm>

using namespace std;

void add(string data[], int i, int j, int n, int m) {
    if (j-1 >= 0) {
        if (data[i][j-1] != '*') data[i][j-1] = ((int)data[i][j-1])+1;
        
        if (i-1 >= 0) {
            if (data[i-1][j-1] != '*') data[i-1][j-1] = ((int)data[i-1][j-1])+1;
        }
        
        if (i+1 < n) {
            if (data[i+1][j-1] != '*') data[i+1][j-1] = ((int)data[i+1][j-1])+1;
        }
    }
    
    if (j+1 < m) {
        if (data[i][j+1] != '*') data[i][j+1] = ((int)data[i][j+1])+1;
        
        if (i-1 >= 0) {
            if (data[i-1][j+1] != '*') data[i-1][j+1] = ((int)data[i-1][j+1])+1;
        }
        
        if (i+1 < n) {
            if (data[i+1][j+1] != '*') data[i+1][j+1] = ((int)data[i+1][j+1])+1;
        }
    }
    
    if (i-1 >= 0) {
        if (data[i-1][j] != '*') data[i-1][j] = ((int)data[i-1][j])+1;
    }
    
    if (i+1 < n) {
        if (data[i+1][j] != '*') data[i+1][j] = ((int)data[i+1][j])+1;
    }
}

int main () {
	int m,n,field=1;
	while (true) {
		cin >> n >> m;
		if (n == 0 && m == 0) break;
		string data[n];
		for (int i = 0; i < n; i++) {
		    cin >> data[i];
		    replace(data[i].begin(), data[i].end(), '.' , '0');
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			    if (data[i][j] == '*') {
			        add(data, i, j, n, m);
			    }
			}
		}
		
		if (field != 1) cout << endl;
		cout << "Field #" << field++ << ":" << endl;
		for (int i = 0; i < n; i++) {
		    cout << data[i] << endl;
		}
	}
	return 0;
}
