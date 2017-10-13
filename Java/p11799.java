
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p11799 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 1; i <= kasus; i++) {
            int banyak = input.nextInt();
            int [] arr = new int[banyak];
            for (int j = 0; j < banyak; j++) {
                arr[j] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("Case %d: %d\n", i, arr[arr.length-1]);
        }
    }
}
