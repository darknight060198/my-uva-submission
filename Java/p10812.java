
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight060198
 */
public class p10812 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int sum = input.nextInt();
            int selisih = input.nextInt();
            int num1 = -1, num2 = -1;
            for (int j = 0; j <= sum/2; j++) {
                int k = sum-j;
                if (Math.abs(j-k)== selisih) {
                    if (j > k) {
                        num1 = j;
                        num2 = k;
                    } else {
                        num1 = k;
                        num2 = j;
                    }
                    break;
                }
//                for (int k = 0; k <= sum; k++) {
//                    if ((j + k) == sum) {
//                        if (Math.abs(j-k) == selisih) {
//                            if (j > k) {
//                                num1 = j;
//                                num2 = k;
//                            } else {
//                                num1 = k;
//                                num2 = j;
//                            }
//                        }
//                    }
//                }
            }
            
            if (num1 == -1 && num2 == -1) System.out.println("impossible");
            else System.out.printf("%d %d\n", num1, num2);
        }
    }
}
