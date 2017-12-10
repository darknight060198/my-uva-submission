#include<stdio.h>
#include<string.h>

int main() {
   int kasus, i;
   scanf("%d", &kasus);
   while (kasus--) {
       char data[100001];
       scanf("%100000s", data);
       int q;
       scanf("%d", &q);
       for (i = 0; i < q; i++) {
           char temp[1001];
           scanf("%1000s", temp);
           if (strstr(data, temp) != NULL) printf("y\n");
           else printf("n\n");
       }
   }
   return 0;
}
