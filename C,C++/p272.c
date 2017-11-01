#include <stdio.h>

int main () {
	char cha;
	int temp = 1;
	while (scanf("%c", &cha) != EOF) {
		if (cha == '"') {
			if (temp) {
				printf("``");
				temp = 0;
			} else {
				printf("''");
				temp = 1;
			}
		} else {
			printf("%c", cha);
		}
	}
	return 0;
}
