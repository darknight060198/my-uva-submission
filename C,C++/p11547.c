/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

int pembalik (int);

int main () {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int num;
        scanf("%d", &num);
        int res = num;
        res *= 567;
        res /= 9;
        res += 7492;
        res *= 235;
        res /= 47;
        res -= 498;
        if (res < 0) res *= -1;
        res %= 100;
        res /= 10;
        printf("%d\n", res);
    }
    
    return 0;
}
