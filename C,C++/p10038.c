#include <stdio.h>
#include <math.h>

int comp (const void * elem1, const void * elem2) 
{
    int f = *((int*)elem1);
    int s = *((int*)elem2);
    if (f > s) return  1;
    if (f < s) return -1;
    return 0;
}

int main () {
    int banyak;
    while (scanf("%d", &banyak) != EOF) {
        int data [banyak];
        int res [banyak-1];
        
        int i;
        for (i = 0; i < banyak; i++) {
            scanf("%d", &data[i]);
        }

        if (banyak < 2) {
            printf("Jolly\n");
            continue;
        } else if (banyak == 2) {
            if (abs(data[1]-data[0]) != 1) {
                printf("Not jolly\n");
                continue;
            } else {
                printf("Jolly\n");
                continue;
            }
        }

        res [0] = abs(data[0]-data[1]);

        i = 2;
        
        while (i != banyak) {
            res[i-1] = abs(data[i]-data[i-1]);
            
            i++;
        }

        qsort (res, sizeof(res)/sizeof(*res), sizeof(*res), comp);

        int status = 1;


        for (i = banyak-2; i > 0; i--) {
            int temp = res[i] - res[i-1];
            if (temp != 1) {
                status = 0;
                break;
            }
        }
        

        if (status) {
            if (res[0] != 1) {
                printf("Not jolly\n");
            } else {
                printf("Jolly\n");
            }
        } else {
            printf("Not jolly\n");
        }
        
    }
    return 0;
}