import java.util.Scanner;

public class p12372 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        for (int i = 1; i <= tc; i++) {
            int width = input.nextInt(), length = input.nextInt(), height = input.nextInt();
            if (width < 21 && length < 21 && height < 21) {
                System.out.printf("Case %d: good\n", i);
            } else {
                System.out.printf("Case %d: bad\n", i);
            }
        }
    }
}
