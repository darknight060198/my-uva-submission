#include <stdio.h>

int findGCD(int num1, int num2) {
	while (num1 != 0 && num2 != 0) {
		int c = num1%num2;
		num1 = num2;
		num2 = c;
	}
	
	if (num1 == 0) return num2;
	else return num1;
}

int main () {
	while (1) {
		int n;
		scanf("%d", &n);
		if (n == 0)break;
		
		int g = 0;
		int i, j;
		for(i = 1; i < n; i++) {
			for (j = i+1; j <= n; j++) {
				g += findGCD(i,j);
			}
		}
		printf("%d\n", g);
	}
	return 0;
}