
import java.util.Scanner;
import java.util.Arrays;

public class p10041 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();

        for (int i = 0; i < kasus; i++) {
            int banyak = input.nextInt();
            int[] data = new int[banyak];

            for (int j = 0; j < banyak; j++) {
                data[j] = input.nextInt();
            }

            Arrays.sort(data);

            int rumahVito;

            if (banyak % 2 == 1) {
                rumahVito = data[banyak / 2];
            } else {
                rumahVito = data[(banyak / 2) - 1];
            }

            int res = 0;
            for (int j = 0; j < banyak; j++) {
                res += Math.abs(rumahVito - data[j]);
            }

            System.out.println(res);
        }
    }
}
