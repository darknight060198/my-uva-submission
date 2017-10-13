/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

long long pembalik (long long);

int main () {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int res = 1;
        long long num, temp;
        scanf("%d", &num);
        while(1) {
            long long balik = pembalik(num);
            temp = num + balik;
            if (temp == pembalik(temp)) break;
            else {
            	num = temp;
				res++;	
			}
        }
        
        printf("%d %lld\n", res, temp);
    }
}

long long pembalik (long long num) {
    long long res = 0;
    while (num > 9) {
        res = res * 10 + num%10;
        num /= 10;
    }
    
    res = res * 10 + num%10;
    
    return res;
}
