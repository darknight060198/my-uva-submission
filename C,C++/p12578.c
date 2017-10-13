#include <stdio.h>
#include <math.h>

double luasLingkaran (double r);

int main () {
	int kasus, i;
	scanf("%d", &kasus);
	for (i = 0; i < kasus; i++) {
		int length;
		scanf("%d", &length);
		double luasLing = luasLingkaran((length*1.0)/5.0);
		double luasPersegi = ((6.0/10.0)*(length*1.0)) * (length*1.0);
		printf("%.2f %.2f\n", luasLing, (luasPersegi-luasLing));
	}
	return 0;
}

double luasLingkaran (double r) {
	return acos(-1)*r*r;
}
