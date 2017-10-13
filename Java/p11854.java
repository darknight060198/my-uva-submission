import java.util.Scanner;

public class p11854 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            if (num1 == 0 && num2 == 0 && num3 == 0) break;

            if (num1 > num2 && num1 > num3) {
                int temp = num1;
                num1 = num3;
                num3 = temp;
            } else if (num2 > num1 && num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }

            int res1 = num1*num1;
            int res2 = num2*num2;
            int res3 = num3*num3;

            if (res1+res2 == res3) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}