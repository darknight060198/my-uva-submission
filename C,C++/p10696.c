#include <stdio.h>

int f91(int num) {
    if (num >= 101) return num-10;
    else return 91;
}

int main () {
    while (1) {
        int num;
        scanf("%d", &num);
        if (num == 0) break;
        printf("f91(%d) = %d\n", num, f91(num));
    }
    return 0;
}