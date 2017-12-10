#include <stdio.h>
#include <string.h>

int main () {
    char data[1002];
	while(1) {
		scanf("%s", data);
		int length = strlen(data);
		int i, sum = 0;
		for (i = 0; i < length; i++) {
		    sum += data[i]-48;
		}
		if (sum == 0) break;
		
		int counter = 1;
		
		while (sum > 9) {
		    int temp = sum;
		    sum = 0;
		    while (temp > 0) {
		        sum += temp%10;
		        temp /= 10;
		    }
		    counter++;
		}
		
		if (sum%9 == 0) {
		    printf("%s is a multiple of 9 and has 9-degree %d.\n", data, counter);
		} else {
		    printf("%s is not a multiple of 9.\n", data);
		}
	}
	return 0;
}