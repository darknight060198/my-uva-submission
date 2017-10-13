import java.util.Scanner;
/**
 * Write a description of class p10341 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p10341
{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double p = input.nextDouble();
            double q = input.nextDouble();
            double r = input.nextDouble();
            double s = input.nextDouble();
            double t = input.nextDouble();
            double u = input.nextDouble();
            
            double res = bisectionMethod(0, 1, p, q, r, s, t, u);
            if ( res == -1) System.out.println("No solution");
            else System.out.printf("%.4f\n", res);
        }
    }
    
    static double bisectionMethod (double low, double high, double p, double q, double r, double s, double t, double u) {
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
    
    static double function (double x, double p, double q, double r, double s, double t, double u) {
        return
            (p * (Math.pow(Math.E, -x))) +
            (q * (Math.sin(x))) +
            (r * (Math.cos(x))) +
            (s * (Math.tan(x))) +
            (t * (Math.pow(x, 2))) +
            u;
    }
    
    static boolean signCheck (double a, double b) {
        return (a >= 0 && b >= 0) || (a < 0 && b < 0);
    }
}