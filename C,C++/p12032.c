#include<stdio.h>
#include<limits.h>

int byk = 0;

int cobaJawaban(int arr[byk], int k) {
    int i = 0;
    for (;i < byk; i++) {
        if (i == 0) {
            if (arr[i] > k) {
                return 0;
            } else {
                if (arr[i] == k) {
                    k--;
                }
            }
        } else {
            if (arr[i]-arr[i-1] > k) {
                return 0;
            } else {
                if (arr[i]-arr[i-1] == k) {
                    k--;
                }
            }
        }
    }
    return 1;
}

int search(int arr[byk], int low, int high, int currJawaban) {
    if (low > high) return currJawaban;
    else {
        int mid = (low+high)/2;
        if (cobaJawaban(arr, mid)) {
            high = mid-1;
            currJawaban = mid;
        } else {
            low = mid+1;
        }
        return search(arr, low, high, currJawaban);
    }
}

int main() {
   int tc, cc = 1, i;
   scanf("%d", &tc);
   while (tc--) {
       scanf("%d", &byk);
       int max = INT_MIN;
       int data[byk];
       for (i = 0; i < byk; i++) {
           scanf("%d", &data[i]);
           if (data[i] > max) max = data[i];
       }
       
       printf("Case %d: %d\n", cc++, search(data, 0, max, 0));
   }
}
