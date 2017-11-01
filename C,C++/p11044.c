#include<stdio.h>
int main() {
	int n, m, i, x, beam, sum1, sum2;
	scanf("%d", &x);
	for(i=1; i<=x; i++) {
		scanf("%d%d", &n, &m);
		if(n>=6 && (m>0 && m<=10000)) {
			n=n-2;
			sum1=n/3;
			if(n%3!=0) {
				sum1=sum1+1;
			}
			if(m==1) {
				m=m+1;
			}
			m=m-2;
			sum2=m/3;
			if(m%3!=0) {
				sum2=sum2+1;
			}
			beam=sum1*sum2;
			printf("%d\n",beam);
		}
	}
	return 0;
}