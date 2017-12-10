#include<stdio.h>
#include<limits.h>

int banyak = 0, container = 0;

int countMax(int arr[banyak]) {
    int res = 0, i = 0;
    for (;i < banyak; i++) {
        res += arr[i];
    }
    
    return res;
}

int cekJawaban(int arr[banyak], int target, int targetCont) {
    int res = 0, cont = 1, i =0;
    for (;i < banyak; i++) {
        if ((res + arr[i]) > target) {
            res = arr[i];
            cont++;
            
            if (res > target) return 0;
        } else {
            res += arr[i];
        }
        
    }
    
    if (cont > targetCont) return 0;
    else return 1;
}

int search(int arr[banyak], int low, int high, int targetCont) {
    int res = INT_MAX;
    while(1) {
        if (high < low) return res;
        else {
            int mid = (high+low) / 2;
            if (cekJawaban(arr,mid,targetCont)) {
                if (mid < res) res = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
    }
}

int main() {
   while (scanf("%d %d", &banyak, &container) == 2) {
       int arr[banyak];
       int i = 0;
       for (;i < banyak; i++) {
           scanf("%d", &arr[i]);
       }
       
       printf("%d\n", search(arr, 0, countMax(arr), container));
   }
   
   return 0;
}
