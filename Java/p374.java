
import java.util.Scanner;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public class p374 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            BigInteger b = new BigInteger(input.next());
            BigInteger p = new BigInteger(input.next());
            BigInteger m = new BigInteger(input.next());

            b = b.modPow(p, m);

            System.out.println(b.toString());

            try{
                input.nextLine();
            } catch (NoSuchElementException e) {
                
            }
        }
    }
}
