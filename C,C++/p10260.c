#include <stdio.h>
#include <string.h>

int konvertHuruf(char c) {
	switch (c) {
		case 'B' :
			return 1;
			break;
		case 'F' :
			return 1;
			break;
		case 'P' :
			return 1;
			break;
		case 'V' :
			return 1;
			break;
		case 'C' :
			return 2;
			break;
		case 'G' :
			return 2;
			break;
		case 'J' :
			return 2;
			break;
		case 'K' :
			return 2;
			break;
		case 'Q' :
			return 2;
			break;
		case 'S' :
			return 2;
			break;
		case 'X' :
			return 2;
			break;
		case 'Z' :
			return 2;
			break;
		case 'D' :
			return 3;
			break;
		case 'T' :
			return 3;
			break;
		case 'L' :
			return 4;
			break;
		case 'M' :
			return 5;
			break;
		case 'N' :
			return 5;
			break;
		case 'R' :
			return 6;
			break;
		default:
			return 0;
		
	}
}

int main () {
	char input[22];
	while (scanf("%20s", input) != EOF) {
		int length = strlen(input);
		int i;
		int sebelum = -5;
		char hasil[21];
		strcpy(hasil, "");
		for (i = 0; i < length; i++) {
			int temp = konvertHuruf(input[i]);
			if (temp == sebelum) {
				continue;
			} else {
				if (temp != 0) {
					char temp1[2];
					sprintf(temp1, "%d", temp);
					strcat(hasil, temp1);
					sebelum = temp;
				} else {
					sebelum = -5;
				}
			}
		}
		printf("%s\n", hasil);
	}
	
	return 0;
}