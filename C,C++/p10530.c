#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
	int num;
	char *high = "Too high";
	char *low = "Too low";
	char *end = "Right on";
	while (1) {
		scanf("%d", &num);
		if (num == 0) break;
		int nbytes = 8;
		char *command = (char *) malloc(nbytes + 1);
		int max, min, current = num;
		while (1) {
			getline(&command, &nbytes, stdin);
			printf(strcmp(high, command) + "tes");
		}
	}

	return 0;
}
