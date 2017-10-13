#include <stdio.h>

int main () {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int sum = 0, banyak, j;
        scanf("%d", &banyak);
        int data [banyak];
        for (j = 0; j < banyak; j++) {
            scanf("%d", &data[j]);
            sum += data[j];
        }

        double average;
        average = sum/banyak;

        int total = 0;
        for (j = 0; j < banyak; j++) {
            if (data[j] > average) total++;
        }

        double hasil = (total*100.0)/banyak;
        char percent = '%';
        printf("%.3lf%c\n", hasil, percent);
    }

    return 0;
}