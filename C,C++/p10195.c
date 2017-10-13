#include <stdio.h>
#include <math.h>

int main () {
    double num1, num2, num3;
    
    while (scanf("%lf %lf %lf", &num1, &num2, &num3) != EOF) {
        double s = (num1+num2+num3)/2;

        if (s == 0) {
            printf("The radius of the round table is: 0.000\n");
            continue;
        }

        double luas = sqrt(s*(s-num1)*(s-num2)*(s-num3));

        double res = luas/s;

        printf("The radius of the round table is: %.3lf\n", res);
    }


    return 0;
}