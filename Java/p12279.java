import java.util.Scanner;

public class p12279 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int kasus = 1;
        while(true) {
            int byk = input.nextInt();
            if (byk == 0) break;
            int a = 0, b = 0, temp;
            for (int i = 0; i < byk; i++) {
                temp = input.nextInt();
                if (temp == 0) b++;
                else a++;
            }
            
            System.out.printf("Case %d: %d\n", kasus++, a-b);
        }
    }
}
