import java.util.Scanner;

public class p11715 {
    static int kasus = 1;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String args[]) {
        while (true) {
            int code = input.nextInt();
            switch (code) {
                case 0 :
                    return;
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
    
    static void pilihan1() {
        double u = input.nextDouble();
        double v = input.nextDouble();
        double t = input.nextDouble();
        double a = (v-u)/t;
        double s = (u*t) + (0.5 * a * (t*t));
        System.out.printf("Case %d: %.3f %.3f\n", kasus++, s, a);
    }
    
    static void pilihan2() {
        double u = input.nextDouble();
        double v = input.nextDouble();
        double a = input.nextDouble();
        double t = (v-u)/a;
        double s = (u*t) + (0.5 * a * (t*t));
        System.out.printf("Case %d: %.3f %.3f\n", kasus++, s, t);
    }
    
    static void pilihan3() {
        double u = input.nextDouble();
        double a = input.nextDouble();
        double s = input.nextDouble();
        double v = Math.sqrt((u*u) + (2.0 * a * s));
        double t = (v-u)/a;
        System.out.printf("Case %d: %.3f %.3f\n", kasus++, v, t);
    }
    
    static void pilihan4() {
        double v = input.nextDouble();
        double a = input.nextDouble();
        double s = input.nextDouble();
        double u = Math.sqrt((v*v) - (2 * a * s));
        double t = (v-u)/a;
        System.out.printf("Case %d: %.3f %.3f\n", kasus++, u, t);
    }
}
