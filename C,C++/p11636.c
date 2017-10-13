#include <stdio.h>

int main () {
    int casee = 1;

    while(1) {
        int num;
        scanf("%d", &num);
        if (num < 0) break;

        int temp = 1, res = 0;
        
        while(temp<num) {
            temp *= 2;
            res++;
        }

        printf("Case %d: %d\n", casee, res);

        casee++;
    }

    return 0;
}