/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <stdio.h>

int main () {
    while(1) {
        int k;
        scanf("%d", &k);
        if (k == 0) break;
        int koorX, koorY;
        scanf("%d %d", &koorX, &koorY);
        
        int i;
        for (i = 0; i < k; i++) {
            int inputX, inputY;
            scanf("%d %d", &inputX, &inputY);
            
            if (inputX == koorX || inputY == koorY) 
                printf("divisa\n");
            else if (inputX > koorX) {
                if (inputY > koorY) {
                    printf("NE\n");
                } else {
                    printf("SE\n");
             