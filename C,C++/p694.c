#include<stdio.h>
#include<math.h>

double bisectionMethod (double low, double high, double p, double q, double r, double s, double t, double u);
double function (double x, double p, double q, double r, double s, double t, double u);
int signCheck (double a, double b);

int main()
{
    double p,q,r,s,t,u;
    while (scanf("%f %f %f %f %f %f", &p, &q, &r, &s, &t, &u) != EOF) {
    	double res = bisectionMethod(0,1,p,q,r,s,t,u);
    	if (res == -1) printf("No solution\n");
    	else printf("%.4f\n", res);
	}

    return 0;
}

double bisectionMethod (double low, double high, double p, double q, double r, double s, double t, double u) {
	if (function(low, p, q, r, s, t, u) * function(high, p, q, r, s, t, u) > 0) return -1;
        else {
            double mid = (low + high) / 2;
            double function = function(mid, p, q, r, s, t, u);
            if (function > -0.0000001 && function < 0.0000001) {
                return mid;
            } else if (signCheck(function(low, p, q, r, s, t, u), function)) {
                return bisectionMethod(mid, high, p, q, r, s, t, u);
            } else {
                return bisectionMethod(low, mid, p, q, r, s, t, u);
            }
        }
}
    
double function (double x, double p, double q, double r, double s, double t, double u) {
	return
            (p * (pow(, -x))) +
            (q * (Math.sin(x))) +
            (r * (Math.cos(x))) +
            (s * (Math.tan(x))) +
            (t * (Math.pow(x, 2))) +
            u;
}

    static boolean signCheck (double a, double b) {
        return (a >= 0 && b >= 0) || (a < 0 && b < 0);
    }
