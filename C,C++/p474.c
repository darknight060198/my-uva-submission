#include <stdio.h>

int main () {
	int n;
	while (scanf("%d", &n) != EOF) {
		int i, y;
		double temp;
		
		temp = 10.0;
		y = 0;
		
		for (i = 0; i < n; i++) {
			if (i == 0) {
				temp /= 2.0;
				y++;
			} else {
				temp /= 2;
				while (temp < 1.0) {
					temp *= 10.0;
					y++; 
				}
			}
		}
		
		printf("2^-%d = %.3lfe-%d\n", i, temp, y);
		
	}
	
	return 0;
}
