#include<stdio.h>

int main() {
    int counter = 1;
    while (1) {
       int s, t, n;
       scanf("%d %d %d", &s, &t, &n);
       if (s == 0 && t == 0 && n == 0) break;
       int i,j,k,l;
       printf("Case %d:\n", counter);
       int max = (s*n) + (t*(n+1));
       for (i = 0; i < t; i++) {
           for (j = 0; j < max; j++) {
               printf("*");
           }
           printf("\n");
       }
       
       for (i = 0; i < n; i++) {
           for (j = 0; j < s; j++) {
               for (k = 0; k < t; k++) {
                   printf("*");
               }
               
               for (k = 0; k < n; k++) {
                   for (l = 0; l < s; l++) {
                       printf(".");
                   }
                   
                   for (l = 0; l < t; l++) {
                       printf("*");
                   }
               }
               
               printf("\n");
           }
           
           for (j = 0; j < t; j++) {
               for (k = 0; k < max; k++) {
                   printf("*");
               }
               printf("\n");
           }
       }
    counter++;
    printf("\n");
   }
   return 0;
}
