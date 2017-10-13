/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <set>

using namespace std;

int main () {

    int kasus, banyak, banyak1;
    cin >> kasus;
    
    for (int i = 0; i < kasus; i++) {
        vector<string> data;
        vector<string> data1;
        set<string> res;
        data.clear();
        data1.clear();
        res.clear();

        cin >> banyak;
        cin >> banyak1;
        
        string temp;

	    getline(cin, temp);
        
        for (int j = 0; j < banyak; j++) {
		    getline(cin, temp);
            data.push_back(temp);
            // cout << temp << endl;
        }

        for (int j = 0; j < banyak1; j++) {
		    getline(cin, temp);
            data1.push_back(temp);
            // cout << temp << endl;
        }

        for (int j = 0; j < banyak; j++) {
            for (int k = 0; k < banyak1; k++) {
                string concatination = data[j] + data1[k];
                res.insert(concatination);
            }
        }

        printf("Case %d: %d\n", i+1, res.size());
    }
    
    return 0;
}