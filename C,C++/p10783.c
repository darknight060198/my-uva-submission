#include <stdio.h>

int main() {
    int kasus, i, j;
    scanf("%d", &kasus);

    for (i = 0; i < kasus; i++) {
        int bawah, atas, res = 0;
        scanf("%d", &bawah);
        scanf("%d", &atas);

        if (bawah%2 == 0) bawah++;

        for (j = bawah; j <= atas; j+=2) {
            res += j;
        }

        printf("Case %d: %d\n", i+1, res);
    }

    return 0;
}