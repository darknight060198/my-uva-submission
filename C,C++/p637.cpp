#include <iostream>
#include <stdio.h>
using namespace std;

int main() {
	int n;
	cin >> n;
	while (n) {
		printf("Printing order for %d pages:\n", n);
		int lembar = n / 4 + (n % 4 != 0 ? 1 : 0);
		int page = lembar * 4;
		for (int i = 1; i <= lembar; i++) {
			int num1 = page - 2 * (i - 1);
			int num2 = 2 * i - 1;
			if (num1 <= n || num2 <= n) {
				if (num1 > n)
					printf("Sheet %d, front: Blank, %d\n", i, num2);
				else if (num2 > n)
					printf("Sheet %d, front: %d, Blank\n", i, num1);
				else
					printf("Sheet %d, front: %d, %d\n", i, num1, num2);
			}
			num1 = 2 * i;
			num2 = page - (2 * i - 1);
			if (num1 <= n || num2 <= n) {
				if (num1 > n)
					printf("Sheet %d, back : Blank, %d\n", i, num2);
				else if (num2 > n)
					printf("Sheet %d, back : %d, Blank\n", i, num1);
				else
					printf("Sheet %d, back : %d, %d\n", i, num1, num2);
			}
		}

		cin >> n;
	}
}
