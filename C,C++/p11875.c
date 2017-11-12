#include<stdio.h>
int main()
{
    int t, n, arr[100],i,j,c=0;
    scanf("%d",&t);
    while(t>0)
    {
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
            scanf("%d",&arr[i]);
        }
        c++;
        j=n/2;
        printf("Case %d: %d\n",c,arr[j]);
        t--;
    }
    return 0;
}