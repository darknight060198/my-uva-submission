#include <iostream>
#include <string>

using namespace std;

bool isPalindrome(string, int, int);
bool isMirrored(string);
string reverse(string);

int main () {
    string kata;
    while (getline(cin, kata)) {
        int length = kata.length();
        if (isPalindrome(kata, 0, length-1)) {
            if (isMirrored(kata)) {
                cout << kata <<" -- is a mirrored palindrome." << endl;
            } else {
                cout << kata <<" -- is a regular palindrome." << endl;
            }
        } else {
            if (isMirrored(kata)) {
                cout << kata <<" -- is a mirrored string." << endl;
            } else {
                cout << kata <<" -- is not a palindrome." << endl;
            }
        }
    }
   return 0;
}

bool isPalindrome(string kata, int low, int high) {
    if (low > high) {
        return true;
    } else {
        if (kata.at(low) == kata.at(high)) return isPalindrome(kata, low += 1, high -= 1);
        else return false;
    }
}

bool isMirrored(string kata) {
    string reverseWord = reverse(kata);
    string temp = "";
    int length = reverseWord.size()-1;
    for (int i = length; i >= 0; i--) {
    	temp.push_back(reverseWord.at(i));
	}
//    cout << temp << " " << endl;
//    cout << kata.compare(reverseWord) << endl;
    if (temp.compare(kata) == 0) return true;
    else return false;
}

string reverse(string kata) {
    string hasil = "";
    for (int i = 0; kata[i] != '\0'; i++) {
        if (kata.at(i) == 'E') {
            hasil.push_back('3');
        } else if (kata.at(i) == '3') {
            hasil.push_back('E');
        } else if (kata.at(i) == 'J') {
            hasil.push_back('L');
        } else if (kata.at(i) == 'L') {
            hasil.push_back('J');
        } else if (kata.at(i) == 'S') {
            hasil.push_back('2');
        } else if (kata.at(i) == '2') {
            hasil.push_back('S');
        } else if (kata.at(i) == 'Z') {
            hasil.push_back('5');
        } else if (kata.at(i) == '5') {
            hasil.push_back('Z');
        } else {
            hasil.push_back(kata.at(i));
        }
    }
    return hasil;
}
