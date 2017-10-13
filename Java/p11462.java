
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
public class p11462 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int banyak = input.nextInt();
            if (banyak == 0) break;
            int [] arr = new int[banyak];
            for (int i = 0 ; i < banyak; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length-1) {
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
