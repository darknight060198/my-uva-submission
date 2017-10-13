#include <stdio.h>

void doIt(int ganteng [1000001], int target) {
    int temp1 = target / 2;
    int temp2 = temp1 + 1;

    if (target%2 == 0) {
        temp1--;
    }
        
    while (temp1 >= 1) {
        if (ganteng[temp1] != 0 && ganteng[temp2] != 0) {
            printf("Peter should buy books whose prices are %d and %d.\n\n", temp1, temp2);
			break;
		}
        temp1--;
        temp2++;
    }
}

int main () {
	int test = 0;
	int banyak;
    while (scanf("%d", &banyak) != EOF) {
		
        int ganteng [1000001];
		int i;
        for (i = 0; i < banyak; i++) {
            int temp;
			scanf("%d", &temp);
			ganteng[temp]++;
        }

        int target;
		scanf("%d", &target);
        if (target % 2 == 0) {
            if (ganteng[target / 2] >= 2) {
                printf("Peter should buy books whose prices are %d and %d.\n\n", target / 2, target / 2);
            } else {
                doIt(ganteng, target);
            }
        } else {
            doIt(ganteng, target);
        }
		
        test++;
        
        for (i = 0; i < 1000001; i++) {
            ganteng[i] = 0;
        }
    }
	return 0;
}
