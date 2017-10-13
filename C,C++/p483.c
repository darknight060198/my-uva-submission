#include <stdio.h>
#include <string.h> 
#include <stdlib.h>

int main () {
	char input[1000];
	int temp5 = 1;
	while (fgets(input,998,stdin)) {
		char temp3[1000];
		temp3[0] = 0;
		char *temp = "something";
		char *regex = " ";
		int temp2 = 1;
		char *res = (char *) malloc(sizeof(char) * 1000);
		res[0] = 0;
		while (temp) {
			if (temp2) {
				temp = strtok(input, " ");
				temp2 = 0;
			} else {
				temp = strtok(NULL, " ");
			}
			
			if(!temp)
				break;
			int i;
			char temp4[1000];
			int j = 0;
			for (i = strlen(temp)-1; i >= 0; i--) {
				if (temp[i] == '\n') continue;
				temp4[j] = temp[i];
				j++;
			}

			temp4[j] = 0;
		
			
			if (temp5) {
				strcat(res, temp4);
				temp5 = 0;
			} else {
				strcat(res, regex);
				strcat(res, temp4);
			}
			
		}
		
		printf("%s\n", res);
		temp5 = 1;
	}
	return 0;
}
