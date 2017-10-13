#include <stdio.h>

int main () {
	char masukan;
	while (scanf("%c", &masukan) == 1) {
		printf("%c", masukan);
	}
	return 0;
}