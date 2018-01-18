#include<algorithm>
#include<cstdio>
using namespace std;
struct Node{
    double tf;
    int order;
};
bool cmp(Node a,Node b){
    return a.tf>b.tf;
}
int main(){
    int Case,N; 
    scanf("%d",&Case); 
    while(Case--){
        scanf("%d",&N);
        int time[1011],fine[1011],i;
        Node a[1011];
        
        for(i=0;i<N;i++){
            scanf("%d %d",&time[i],&fine[i]);
            a[i].tf=fine[i]*1.0/time[i]; 
            a[i].order=i+1;
        }
        
        sort(a,a+N,cmp);        

        printf("%d",a[0].order);
        for(i=1;i<N;i++)
            printf(" %d",a[i].order);
        printf("\n");
        
        if(Case)         
            printf("\n");
    }
    return 0;
}