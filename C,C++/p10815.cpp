#include <iostream>
#include <set>
#include <string>

using namespace std;

inline bool IsLowerChar(char c)
{
    return c >= 'a' && c <= 'z';
}

int main()
{
    string input;
    set<string> hasil;
    
    while (cin >> input)
    {
        int size = input.size();
        
        string current = "";
        for (int i = 0; i < size; ++i)
        {
            char c = tolower(input[i]);
            if (IsLowerChar(c)) current += c;
            else if (current != "")
            {
                hasil.insert(current);
                current = "";
            }
        }
        if (current != "") hasil.insert(current);
    }
    
    for (set<string>::iterator iter = hasil.begin(); iter != hasil.end(); ++iter) {
        cout << *iter << endl;
	}
	
	return 0;
}
