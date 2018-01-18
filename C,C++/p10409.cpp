#include <iostream>
#include <cstring>

using namespace std;

int dadu[6] = {1,2,3,4,5,6};

void reset() {
    dadu[0] = 1;
    dadu[1] = 2;
    dadu[2] = 3;
    dadu[3] = 4;
    dadu[4] = 5;
    dadu[5] = 6;
}

void north() {
    int south = dadu[4], top = dadu[0], north = dadu[1], bot = dadu[5];
    dadu[4] = top;
    dadu[0] = north;
    dadu[1] = bot;
    dadu[5] = south;
}

void south() {
    int south = dadu[4], top = dadu[0], north = dadu[1], bot = dadu[5];
    dadu[4] = bot;
    dadu[0] = south;
    dadu[1] = top;
    dadu[5] = north;
}

void west() {
    int west = dadu[2], top = dadu[0], east = dadu[3], bot = dadu[5];
    dadu[2] = bot;
    dadu[0] = west;
    dadu[3] = top;
    dadu[5] = east;
}

void east() {
    int west = dadu[2], top = dadu[0], east = dadu[3], bot = dadu[5];
    dadu[2] = top;
    dadu[0] = east;
    dadu[3] = bot;
    dadu[5] = west;
}

int main() {
    int byk;
    while (true) {
        cin >> byk;
        if (byk == 0) break;
        reset();
        string command;
        for (int i = 0; i < byk; i++) {
            cin >> command;
            if (command.compare("north") == 0) {
                south();
            } else if (command.compare("south") == 0) {
                north();
            } else if (command.compare("west") == 0) {
                east();
            } else {
                west();
            }
        }
        
        cout << dadu[0] << endl;
    }
    return 0;
}
