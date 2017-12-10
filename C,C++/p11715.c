#include <stdio.h>
#include <math.h>

int kasus = 1;

void pilihan1() {
    double u,v,t;
    scanf("%lf %lf %lf", &u, &v, &t);
    double a = (v-u)/t;
    double s = (u*t) + (0.5 * a * (t*t));
    printf("Case %d: %.3lf %.3lf\n", kasus++, s, a);
}
    
void pilihan2() {
    double u,v,a;
    scanf("%lf %lf %lf", &u, &v, &a);
    double t = (v-u)/a;
    double s = (u*t) + (0.5 * a * (t*t));
    printf("Case %d: %.3lf %.3lf\n", kasus++, s, t);
}
    
void pilihan3() {
    double u,a,s;
    scanf("%lf %lf %lf", &u, &a, &s);
    double v = sqrt((u*u) + (2.0 * a * s));
    double t = (v-u)/a;
    printf("Case %d: %.3lf %.3lf\n", kasus++, v, t);
}
    
void pilihan4() {
    double v,a,s;
    scanf("%lf %lf %lf", &v, &a, &s);
    double u = sqrt((v*v) - (2.0 * a * s));
    double t = (v-u)/a;
    printf("Case %d: %.3lf %.3lf\n", kasus++, u, t);
}

int main() {
    while(1) {
        int code;
        scanf("%d", &code);
        switch(code) {
            case 0 :
                return 0;
            case 1 :
                pilihan1();
                break;
            case 2 :
                pilihan2();
                break;
            case 3 :
                pilihan3();
                break;
            case 4 :
                pilihan4();
                break;
       }
   }
}
