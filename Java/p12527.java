package Easy;

import java.util.Scanner;

public class p12527 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int res = 0;
            for (int i = num1; i <= num2; i++) {
                if (!haveMultipleDigit(i)) {
                    res++;
                }
            }

            System.out.println(res);
        }
    }

    static boolean haveMultipleDigit(int num) {
        boolean[] temp = new boolean[10];

        while (num > 0) {
            int mod = num % 10;
            if (temp[mod]) {
                return true;
            } else {
                temp[mod] = true;
            }
            num /= 10;
        }

        return false;
    }
}
