#include<stdio.h>

int apakahDiaTujuh(int num) {
    if (num%7 == 0) return 1;
    else {
        while (num > 0) {
            if (num%10 == 7) return 1;
            num/=10;
        }
        
        return 0;
    }
}

int main() {
   int m, n, k;
   while (scanf("%d %d %d", &n, &m, &k) == 3 && n || m || k) {
       int org = 1, clap = 0, menaik = 1, num = 1;
       while (clap < k) {
           if (apakahDiaTujuh(num) && org == m) {
               clap++;
           }
           
           if (menaik && org == n) menaik = 0;
           if (!menaik && org == 1) menaik = 1;
           
           if (menaik) {
               org++;
               num++;
           } else {
               org--;
               num++;
           }
       }
       
       printf("%d\n", num-1);
   }
   
   return 0;
}
