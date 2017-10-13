#include <stdio.h>

int main () {
	int kasus, i;
	scanf("%d", &kasus);
	for (i = 1; i <= kasus; i++) {
		int banyak, j, k, l;
		scanf("%d", &banyak);
		int data[banyak][banyak];
		for (j = 0; j < banyak; j++) {
			int tempmasukan;
			scanf("%d", &tempmasukan);
			for (k = banyak-1; k >= 0; k--) {
				data[j][k] = tempmasukan%10;
				tempmasukan/=10;
			}
		}
		
		int bykComm;
		scanf("%d", &bykComm);
		getchar();
		for(j = 0; j < bykComm; j++) {
			char kode[15];
			scanf("%s", kode);
			switch (kode[0]) {
				case 'r':
				{
					int rowA, rowB;
					scanf("%d %d", &rowA, &rowB);
					rowA--;
					rowB--;
					for (k = 0; k < banyak; k++) {
						int temp = data[rowA][k];
						data[rowA][k] = data[rowB][k];
						data[rowB][k] = temp;
					}
					break;
				}
				case 'c':
				{
					int colA, colB;
					scanf("%d %d", &colA, &colB);
					colA--;
					colB--;
					for (k = 0; k < banyak; k++) {
						int temp = data[k][colA];
						data[k][colA] = data[k][colB];
						data[k][colB] = temp;
					}
					break;
				}
				case 'i':
				{
					for (k = 0; k < banyak; k++) {
						for (l = 0; l < banyak; l++) {
							data[k][l]++;
							if (data[k][l] > 9) {
								data[k][l] %= 10;
							}
						}
					}
					break;
				}
				case 'd':
				{
					for (k = 0; k < banyak; k++) {
						for (l = 0; l < banyak; l++) {
							data[k][l]--;
							if (data[k][l] < 0) {
								data[k][l] += 10;
							}
						}
					}
					break;
				}
				case 't':
				{
					int temp[banyak][banyak];
					for (k = 0; k < banyak; k++) {
						for (l = 0; l < banyak; l++) {
							temp[l][k] = data[k][l];
						}
					}
					
					for (k = 0; k < banyak; k++) {
						for (l = 0; l < banyak; l++) {
							data[k][l] = temp[k][l];
						}
					}
					break;
				}
			}
		}
		
		printf("Case #%d\n", i);
		for (k = 0; k < banyak; k++) {
			for (l = 0; l < banyak; l++) {
				printf("%d", data[k][l]);
			}
			printf("\n");
		}
		
		printf("\n");
		
	}
	return 0;
}