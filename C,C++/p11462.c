#include<stdio.h>
#include<stdlib.h>

int compair(const void *i, const void *j);

int main()
{
    int i,n;

    while(scanf("%d",&n)==1){
     int  num[n];
        if(n==0)
            break;

        for(i=0;i<n;i++){
            scanf("%d",&num[i]);
        }
           qsort(num,n,sizeof(int),compair);

            for(i=0;i<n-1;i++)
                printf("%d ",num[i]);

                printf("%d",num[n-1]);
                printf("\n");
    }

    return 0;
}

int compair(const void *i, const void *j)
{
    return *(int *)i - *(int *)j;
}
