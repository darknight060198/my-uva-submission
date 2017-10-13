
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
public class p10038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int banyak = input.nextInt();
            int [] arr = new int[banyak];
            int [] res = new int[banyak-1];
            
            for (int i = 0; i < banyak; i++) {
                arr[i] = input.nextInt();
            }

            if (banyak < 2) {
                System.out.printf("Jolly\n");
                continue;
            } else if (banyak == 2) {
                if (Math.abs(arr[1]-arr[0]) != 1) {
                    System.out.printf("Not jolly\n");
                    continue;
                } else {
                    System.out.printf("Jolly\n");
                    continue;
                }
            
            }
            res [0] = Math.abs(arr[0]-arr[1]);
            
            int i = 2;
        
            while (i != banyak) {
                res[i-1] = Math.abs(arr[i]-arr[i-1]);

                i++;
            }
            
            Arrays.sort(res);
            
            boolean status = true;
            
            for (i = banyak-2; i > 0; i--) {
                int temp = res[i] - res[i-1];
                if (temp != 1) {
                    status = false;
                    break;
                }
            }
            
            if (status) {
                if (res[0] != 1) {
                    System.out.printf("Not jolly\n");
                } else {
                    System.out.printf("Jolly\n");
                }
            } else {
                System.out.printf("Not jolly\n");
            }
        }
    }
}
