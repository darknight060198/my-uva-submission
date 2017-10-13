
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p11192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int banyakGrup = input.nextInt();
            if (banyakGrup == 0) break;
            
            String masukan = input.nextLine().trim();
            int length = masukan.length();
            int counter = length/banyakGrup;
            Stack<Character> stack = new Stack<>();
            
            for (int i = 0; i < length; i++) {
                if (counter != 0) {
                    stack.push(masukan.charAt(i));
                    counter--;
                } else {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    counter = length/banyakGrup;
                    i--;
                }
                
            }
            
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            
            System.out.println();
        }
        
    }
    
}
