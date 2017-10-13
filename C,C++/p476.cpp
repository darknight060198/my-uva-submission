#include <stdio.h>
#include <vector>
#include <cmath>
#include <iterator>

using namespace std;

class Persegi {
    public :
    	double x, y, width, height;
    	Persegi(double x, double y, double width, double height) {
    		this->x = x;
    		this->y = y;
    		this->width = width;
    		this->height = height;
    	}
    	
    	bool isInside(double x, double y) {
    		return (x > this->x && x < (this->x + this->width) && y < this->y && y > (this->y - this->height));
    	}
};

int main () {
	vector <Persegi> kumpPersegi;
	char temp;
	while (true) {
		scanf("%c", &temp);
		if (temp == '*') break;
		else if (temp == 'r') {
			double x1, y1, x2, y2;
			scanf("%lf %lf %lf %lf", &x1, &y1, &x2, &y2);
// 			printf("%lf %lf %lf %lf\n", x1, y1, abs(x1-x2), abs(y1-y2));
			Persegi persegi(x1, y1, abs(x1-x2), abs(y1-y2));
			kumpPersegi.push_back(persegi);
		}
	}
	
	double pointX, pointY;
	int point = 1;
	while (true) {
		bool status = false;
		scanf("%lf %lf", &pointX, &pointY);
// 		printf("%lf %lf\n", pointX, pointY);
		if (pointX == 9999.9 && pointY == 9999.9) break;
		int figure = 1;
		for (auto it = kumpPersegi.begin(); it != kumpPersegi.end(); ++it, figure++) {
			if (it->isInside(pointX, pointY)) {
				printf("Point %d is contained in figure %d\n", point, figure);
				status = true;
			}
		}
		
		if (!status) {
			printf("Point %d is not contained in any figure\n", point);
		}
		point++;
	}
	
	return 0;
}