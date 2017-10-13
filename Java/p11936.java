import java.util.Scanner;

public class p11936 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            if (num1+num2 > num3 && num1+num3 > num2 && num2+num3 > num1) {
                System.out.println("OK");
            } else {
                System.out.println("Wrong!!");
            }
        }
    }
}