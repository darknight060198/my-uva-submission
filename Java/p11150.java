
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
public class p11150 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int num = input.nextInt();
            int res = num;
            while (num >= 3) {
                res += num/3;
                num = num/3 + num%3;
            }
            
            if (num == 2) res++;
            
            System.out.println(res);
        }
    }
}
