#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int counter123;
unsigned int fromBin;
int i, j;
char c;
char *input;
char hasil[100000];
char temp[9];

int fromBinary(const char *s) {
  return (int) strtol(s, NULL, 2);
}

int main () {
	size_t buffersize = 13;
	
	getline(&input, &buffersize, stdin);
	
	counter123 = 0;
	
	while (1) {
		getline(&input, &buffersize, stdin);
		if (input[0] == '_') break;
		
		for (i = 1, j = 0; i < 10; i++) {
			if (input[i] != '\n' || input[i] != '\0') {
				if (input[i] == 'o') temp[j] = '1';
				else if (input[i] == '.') continue;
				else temp[j] = '0';
				
				j++;
			}
		}
		
		fromBin = fromBinary(temp);
		c = fromBin;
		hasil[counter123] = c;
		
		counter123++;
		
	}

	
	printf("%s", hasil);
	
	return 0;
}

