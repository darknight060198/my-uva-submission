#include<stdio.h>

int kuadrat(int);
int sumDigit(int);

int main() {
    int kasus, i;
    scanf("%d", &kasus);
    for (i = 0; i < kasus; i++) {
        int num, temp;
        int data[10000];
        int ada = 0;
        int j, index = 0;
        int isHappy = 0;
        scanf("%d", &num);
        temp = num;
        while (1) {
            if (temp == 1) {
                isHappy = 1;
                break;
            }
            for (j = 0; j <= index; j++) {
                if (data[j] == temp) {
                    ada = 1;
                    break;
                }
            }
            if (!ada) {
                data[index+1] = temp;
                index++;
            } else {
                break;
            }
            temp = sumDigit(temp);
            if (temp == num) {
                break;
            }
            ada = 0;
        }
        
        if (isHappy) printf("Case #%d: %d is a Happy number.\n", i+1, num);
        else printf("Case #%d: %d is an Unhappy number.\n", i+1, num);
    }
}

int kuadrat (int num) {
    return num*num;
}

int sumDigit(int num) {
    int res = 0;
    while (num > 9) {
        res += kuadrat(num%10);
        num /= 10;
    }
    
    res += kuadrat(num);
    return res;
}
