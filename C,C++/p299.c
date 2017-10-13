#include <stdio.h>

int main () {
	int kasus, i;
	scanf("%d", &kasus);
	if (kasus == 0) {
		printf("Optimal train swapping takes 0 swaps.\n");
	}
	for (i = 0; i < kasus; i++) {
		int banyak, j;
		scanf("%d", &banyak);
		if (banyak == 0) {
			printf("Optimal train swapping takes 0 swaps.\n");
			continue;
		}
		int data [banyak];
		for (j = 0; j < banyak; j++) {
			scanf("%d", &data[j]);
		}
		
		int status = 0, res = 0;
		
		while (1) {
			status = 0;
			for (j = 0; j < banyak-1; j++) {
				if (data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					status = 1;
					res++;
				}
			}
			
			if (status == 0) break;
		}
		
		printf("Optimal train swapping takes %d swaps.\n", res);
	}
	return 0;
}