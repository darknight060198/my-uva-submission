#include <stdio.h>
#include <string.h>

int isLetter(char c) {
	if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') return 1;
	else return 0;
}

int main () {
	int tc;
	scanf("%d", &tc);
	while (tc--) {
		char first[22];
		char second[22];
		scanf("%s", first);
		scanf("%s", second);
		
		if (strlen(first) != strlen(second)) {
			printf("No\n");
		} else {
			int length = strlen(first), i;
			int status = 1;
			for (i = 0; i < length; i++) {
				if (!isLetter(first[i])) {
					if (second[i] != first[i]) {
					    printf("No\n");
					    status = 0;
					    break;
					}
				}
			}
			
			if (status) {
			    printf("Yes\n");
			}
		}
	}
	return 0;
}