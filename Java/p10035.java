package SOLVED;


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
public class p10035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if (num1 == 0 && num2 == 0) break;
            int temp1 = num1;
            int temp2 = num2;
            int res = 0;
            int cadangan = 0;
            while (true) {
                if(temp1 == 0 && temp2 == 0) break;
                int digit1 = temp1%10;
                int digit2 = temp2%10;
                if (digit1 + digit2 + cadangan > 9) {
                    res++;
                    cadangan = 1;
                } else {
                    cadangan = 0;
                }
                temp1 /= 10;
                temp2 /= 10;
            }
            
            if (res == 0) System.out.println("No carry operation.");
            else if (res > 1) System.out.printf("%d carry operations.\n", res);
            else System.out.printf("%d carry operation.\n", res);
        }
    }
}
