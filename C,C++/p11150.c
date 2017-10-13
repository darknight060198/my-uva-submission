/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

int main () {
    int n;
    while(scanf("%d", &n) != EOF) {
        int res = n;
        while (n >= 3) {
            res += n/3;
            n = n/3 + n%3;
        }
        
        if (n == 2) res++;
        
        printf("%d\n", res);
    }
    
    return 0;
}
