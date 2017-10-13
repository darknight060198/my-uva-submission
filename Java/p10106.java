
import java.math.BigInteger;
import java.util.Scanner;

public class p10106 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            BigInteger num1 = new BigInteger(input.nextLine());
            BigInteger num2 = new BigInteger(input.nextLine());

            num1 = num1.multiply(num2);

            System.out.println(num1.toString());
        }
    }
}
