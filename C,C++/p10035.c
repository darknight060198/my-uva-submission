#include <stdio.h>

int main() {
    int num1, num2;
    
    while (1) {
        scanf("%d %d", &num1, &num2);
        if (num1 == 0 && num2 == 0) break;

        int res = 0;
		int temp1 = num1;
		int temp2 = num2;
		int cadangan = 0;
		
        while (1) {

            if (temp1 == 0 && temp2 == 0) break;
			
            int digit1 = temp1%10;
            int digit2 = temp2%10;
			
            if (digit1+digit2+cadangan > 9) {
				res++;
				cadangan = 1;
			} else {
				cadangan = 0;
			}

            temp1 /= 10;
            temp2 /= 10;
			
        }
		if (res == 0) {
			printf("No carry operation.\n");
		} else if (res == 1) {
			printf("1 carry operation.\n");
		} else {
			printf("%d carry operations.\n", res);
		}
    }

    return 0;
}