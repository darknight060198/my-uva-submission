
import java.util.Scanner;

public class p299 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        if (kasus == 0) {
            System.out.println("Optimal train swapping takes 0 swaps.");
        }
        for (int i = 0; i < kasus; i++) {
            int banyak = input.nextInt();
            if (banyak == 0) {
                System.out.println("Optimal train swapping takes 0 swaps.");
                continue;
            }
            int[] data = new int[banyak];
            for (int j = 0; j < banyak; j++) {
                data[j] = input.nextInt();
            }

            int res = 0;
            boolean status;

            while (true) {
                status = false;

                for (int j = 0; j < banyak - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                        res++;
                        status = true;
                    }
                }

                if (!status) {
                    break;
                }
            }

            System.out.printf("Optimal train swapping takes %d swaps.\n", res);
        }
    }
}