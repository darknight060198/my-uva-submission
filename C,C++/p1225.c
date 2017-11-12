#include<stdio.h>
#include<string.h>

static int outputNum[10];
 
int main() {
 
    int n;
 
    scanf("%d", &n);
 
    while( n-- ){
 
        int num;
        scanf("%d", &num);
 
        memset(outputNum, 0, sizeof outputNum);

        int k = 0, i;
        for(i = 1; i <= num; ++i){
 
            int num = i;
            while(num){
                ++outputNum[num % 10];
                num /= 10;
            }
        }
 
        for(i = 0; i < 10; ++i){
            if(i) printf(" ");
            printf("%d", outputNum[i]);
        }
        printf("\n");
    }
 
    return 0;
}