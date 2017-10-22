#include <stdio.h>

int main () {
	int tc, i;
	scanf("%d", &tc);
	while (tc--) {
		int banyak;
		scanf("%d", &banyak);
		double res = 0;
		for (i = 0; i < banyak; i++) {
			int luas, binatang, poin;
			scanf("%d %d %d", &luas, &binatang, &poin);
			double hasil = ((luas*1.0)/(binatang*1.0)) * (poin*1.0) * (binatang*1.0);
			res += hasil;
		}
		
		printf("%.0f\n", res);
	}
	return 0;
}
