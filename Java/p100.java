
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
public class p100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            int num1 = 0, num2 = 0;

            if (number1 > number2) { 
                num1 = number2;
                num2 = number1;
            } else {
                num1 = number1;
                num2 = number2;
            }

            int total = 0;

            for (int i = num1; i <= num2; i++) {
                int res = 1;
                int temp = i;
                while (temp != 1) {
                    if (temp%2 == 1) temp = temp*3 + 1;
                    else temp /= 2;
                    res++;
                }
                if (res > total) total = res;
            }

            System.out.printf("%d %d %d\n", number1, number2, total);
        }
    }
}
