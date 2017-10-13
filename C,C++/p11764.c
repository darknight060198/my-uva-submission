/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

int main () {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int banyak, j, temp;
        int max = 0, min = 0;
        scanf("%d", &banyak);
        int data [banyak];
        for (j = 0; j < banyak; j++) {
            scanf("%d", &temp);
            data[j] = temp;
        }
        
        for (j = 0; j < banyak-1; j++) {
            if (data[j] > data[j+1]) min++;
            else if (data[j] < data[j+1]) max++;
        }
        
        printf("Case %d: %d %d\n", i+1, max, min);
    }
}
