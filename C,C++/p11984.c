#include <stdio.h>

int main(){
	int kasus, i;
	scanf("%d", &kasus);
	for (i = 1; i <= kasus; i++) {
		int c, f;
		scanf("%d %d", &c, &f);
		double pertambahan = ((9.0/5.0)*c) + 32;
		pertambahan += f;
		double res = (pertambahan-32) * (5.0/9.0);
		printf("Case %d: %.2f\n", i, res);
	}
	return 0;
}
