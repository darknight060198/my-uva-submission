#include<stdio.h>
#include<math.h>
#define E (2.7182818284590452353602874713526624977572470937L )

double bisectionMethod (double low, double high, double p, double q, double r, double s, double t, double u);
double function (double x, double p, double q, double r, double s, double t, double u);
int signCheck (double a, double b);

int main()
{
    double p,q,r,s,t,u;
    while (scanf("%lf %lf %lf %lf %lf %lf", &p, &q, &r, &s, &t, &u) != EOF) {
    	double res = bisectionMethod(0.0,1.0,p,q,r,s,t,u);
    	if (res == -1) printf("No solution\n");
    	else printf("%.4f\n", res);
	}

    return 0;
}

double bisectionMethod (double low, double high, double p, double q, double r, double s, double t, double u) {
	if (function(low, p, q, r, s, t, u) * function(high, p, q, r, s, t, u) > 0) return -1;
        else {
            double mid = (low + high) / 2.0;
            double function1 = function(mid, p, q, r, s, t, u);
            if (function1 > -0.0000001 && function1 < 0.0000001) {
                return mid;
            } else if (signCheck(function(low, p, q, r, s, t, u), function1)) {
                return bisectionMethod(mid, high, p, q, r, s, t, u);
            } else {
                return bisectionMethod(low, mid, p, q, r, s, t, u);
            }
        }
}
    
double function (double x, double p, double q, double r, double s, double t, double u) {
	return
            (p * (pow(E, -x))) +
            (q * (sin(x))) +
            (r * (cos(x))) +
            (s * (tan(x))) +
            (t * (pow(x, 2))) +
            u;
}

int signCheck (double a, double b) {
	if ( (a >= 0 && b >= 0) || (a < 0 && b < 0)) return 1;
	else return 0;
}
