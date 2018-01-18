import java.util.Scanner;

public class p11364 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while (tc-- != 0) {
            int byk = input.nextInt(), min = 100, max = -1, temp;
            for (int i = 0; i < byk; i++) {
                temp = input.nextInt();
                if (temp > max) max = temp;
                if (temp < min) min = temp;
            }
            
            System.out.println((2*(max-min)));
        }
    }
}
