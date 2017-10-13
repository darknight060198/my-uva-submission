#include <stdio.h>
#include <stdlib.h>

int comp (const void * elem1, const void * elem2) 
{
    int f = *((int*)elem1);
    int s = *((int*)elem2);
    if (f > s) return  1;
    if (f < s) return -1;
    return 0;
}

int main () {
	int num, panjang = 0;
	int data [10000];
	
	while (scanf("%d", &num) != EOF) {
		data[panjang] = num;
		panjang++;
		qsort (data, panjang, sizeof(*data), comp);
		
		if (panjang%2==0) {
			int temp = ((panjang+1)/2)-1;
			int median = (data[temp] + data[temp+1]) /2;
			printf("%d\n", median);
		} else {
			int median = data[((panjang+1)/2)-1];
			printf("%d\n", median);			
		}
	}
	return 0;
}
