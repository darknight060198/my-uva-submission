#include <stdio.h>

void printing (int banyak) {
	int i;
	for (i = 1; i <= banyak; i++) {
		printf("%d", banyak);
	}
}

int main() {
	int kasus;
	scanf("%d", &kasus);
	getchar();
	while (kasus--) {
		getchar();
		int max, banyak;
		scanf("%d", &max);
		scanf("%d", &banyak);
		int i, j;
		for (i = 0; i < banyak; i++) {
			for (j = 1; j <= max; j++) {
				printing(j);
				printf("\n");
			}
			
			for (j = max-1; j > 0; j--) {
				printing(j);
				printf("\n");
			}
			
			if (i != banyak-1) printf("\n");
		}
		
		if (kasus != 0) printf("\n");
	}
	return 0;
}
