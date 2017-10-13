#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int compair(const void *i, const void *j)
{
    return *(int *)i - *(int *)j;
}

int main () {
	int kasus, i;
	scanf("%d", &kasus);
	for (i = 0; i < kasus; i++) {
		int banyak, j;
		scanf("%d", &banyak);
		int data[banyak];
		for (j = 0; j < banyak; j++) {
			scanf("%d", &data[j]);
		}
		
		qsort(data, banyak, sizeof(int), compair);
		
		int rumahVito = 0;
		
		if (banyak%2 == 1) {
			rumahVito = data[banyak/2];
		} else {
			rumahVito = data[(banyak/2)-1];
		}
		
		int res = 0;
		
		for (j = 0; j < banyak; j++) {
			res += abs(rumahVito-data[j]);
		}
		
		printf("%d\n", res);
	}
	return 0;
	
}