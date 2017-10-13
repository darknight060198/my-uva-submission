#include <stdio.h>

int main () {
    int kasus;
    scanf("%d", &kasus);
    while (kasus--) {
        int num1, num2, num3;
        scanf("%d %d %d", &num1, &num2, &num3);

        if (num1+num2 > num3 && num1+num3 > num2 && num2+num3 > num1) {
            printf("OK\n");
        } else {
            printf("Wrong!!\n");
        }
    }
    return 0;
}