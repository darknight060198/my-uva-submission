import java.util.Scanner;

public class p11479 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            long num1 = input.nextLong();
            long num2 = input.nextLong();
            long num3 = input.nextLong();

            if (num1 == num2 && num2 == num3 && num3 == num1) {
                System.out.printf("Case %d: Equilateral\n", i+1);
            } else if (num1+num2 > num3 && num1+num3 > num2 && num2+num3 > num1) {
                if (num1 == num2 || num1 == num3 || num2 == num3) {
                    System.out.printf("Case %d: Isosceles\n", i+1);
                } else {
                    System.out.printf("Case %d: Scalene\n", i+1);
                }
            } else {
                System.out.printf("Case %d: Invalid\n", i+1);
            }
        }
    }
}