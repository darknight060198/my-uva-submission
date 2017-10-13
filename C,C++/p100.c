/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

int cekCycle (int);

int main () {
    int num1, num2;
    while(scanf("%d %d", &num1, &num2) != EOF) {
        int res = 0;
        int i;
        if (num1 < num2) {
        	for (i = num1; i <= num2; i++) {
            	int temp = cekCycle(i);
            	if (temp > res) res = temp;
        	}
		} else {
			for (i = num2; i <= num1; i++) {
            	int temp = cekCycle(i);
            	if (temp > res) res = temp;
        	}
		}
        
        
        printf("%d %d %d\n", num1, num2, res);
    }
    
    return 0;
}

int cekCycle (int num) {
    int res = 1;
    while (num != 1) {
        if (num % 2 == 1) num = 3*num + 1;
        else num/=2;
        res++;
    }
    
    return res;
}
