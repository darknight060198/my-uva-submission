#include <stdio.h>

int cekMenang(char, char);

int main () {
	int r, c, d, kasus;
	scanf("%d", &kasus);
	int i;
	for (i = 0; i < kasus; i++) {
		scanf("%d %d %d", &r, &c, &d);
		char data [r+1][c+1];
		int j, k;
		for (j = 0; j < r; j++) {
			scanf("%s", data[j]);	
		}
		
//		printf("%c\n", data[r-1][c-1]);
//		printf("\n");
		char res [r+1][c+1];
		
		for (j = 0; j < d; j++) {
			int l;
			for (k = 0; k < r-1; k++) {
				for(l = 0; l < c; l++) {
					if (l==0) res[k][l] = data[k][l];
					if (l != c-1) {
						if (cekMenang(data[k][l], data[k][l+1])) res[k][l+1] = data[k][l];
						else res[k][l] = data[k][l+1];
						
						if (cekMenang(data[k][l], data[k+1][l])) res[k+1][l] = data[k][l];
						else res[k][l] = data[k+1][l];
					} else {
						if (cekMenang(data[k][l], data[k+1][l])) res[k+1][l] = data[k][l];
						else res[k][l] = data[k+1][l];
					}
				}
			}
			
			for (l = 0; l < c; l++) {
				if (l == c-1) res[k][l] = data[k][l];
				else {
					if (cekMenang(data[k][l], data[k][l+1])) res[k][l+1] = data[k][l];
				else res[k][l] = data[k][l+1];
				}				
			}
			
			for (k = 0; k < r; k++) {
				for (l = 0; l < c; l++) {
					data[k][l] = res[k][l];
				}
			}
			
			
		}
		
		for (k = 0; k < c; k++) {
				printf("%s\n", res[k]);
		}
	}
}

int cekMenang(char char1, char char2) {
	if (char1 == 'R') {
		if (char2 == 'R' || char2 == 'S') return 1;
		else return 0;
	} else if (char1 == 'S') {
		if (char2 == 'S' || char2 == 'P') return 1;
		else return 0;
	} else {
		if (char2 == 'P' || char2 == 'R') return 1;
		else return 0;
	}
}
