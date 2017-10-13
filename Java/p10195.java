import java.util.Scanner;

public class p10195 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double num3 = input.nextDouble();

            double s = (num1+num2+num3)/2;

            if (s == 0) {
                System.out.printf("The radius of the round table is: 0.000\n");
                continue;
            }

            double luas = Math.sqrt(s*(s-num1)*(s-num2)*(s-num3));

            double res = luas/s;

            System.out.printf("The radius of the round table is: %.3f\n", res);   
        }
    }
}