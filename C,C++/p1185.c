#include <stdio.h>
#include <math.h>

int main () {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int num, j;
        scanf("%d", &num);

        double numDigit = 0.0;
        for (j = num; j > 1; j--) {
            numDigit += log10(j*1.0);
        }

        numDigit = floor(numDigit) + 1;
        int res = (int) numDigit;
        printf("%d\n", res);
    }

    return 0;
}