
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
public class p11332 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            int total = Integer.MAX_VALUE;
            while (total > 9) {
                num = sum(num);
                total = num;
            }
            System.out.println(total);
        }
    }
    
    static int sum (int num) {
        int temp = num;
        int total = 0;
        while (temp > 9) {
            total += temp%10;
            temp /= 10;
        }
        total += temp;
        return total;
    }
}
