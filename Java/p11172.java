
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
public class p11172 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            if (num1 < num2) System.out.println("<");
            else if (num1 == num2) System.out.println("=");
            else System.out.println(">");
        }
    }
}
