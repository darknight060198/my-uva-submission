#include<stdio.h>

int main() {
    int n, count = 1, i, j;
    while (scanf("%d", &n) == 1) {
        int arr[n];
        long long hasil = 0;
        for (i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }
        long long temp;
        for (i = 0; i < n; i++) {
            temp = arr[i];
            if (temp > hasil) {
                hasil = temp;
            }
            
            for (j = i+1; j < n; j++) {
                temp *= arr[j];
                if (temp > hasil) {
                    hasil = temp;
                }
            }
        }
        
        printf("Case #%d: The maximum product is %lld.\n\n", count++, hasil);
   }
   
   while(getchar() != EOF);
   return 0;
}
