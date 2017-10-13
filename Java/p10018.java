
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
public class p10018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            long num = input.nextLong();
            long res = 0;
            int count = 0;
            while (true) {
                num += reverse(num);
                String numInString = Long.toString(num);
                count++;
                if (isPalindrome(numInString, 0, numInString.length()-1)) {
                    res = num;
                    break;
                }
            }
            System.out.printf("%d %d\n", count, res);
        }
    }
    
//    static int count (int num) {
//        
//    }
    
    static long reverse(long num) {
        String num1 = Long.toString(num);
        String res = "";
        for (int i = num1.length()-1; i >= 0; i--) {
            res += num1.charAt(i);
        }
        return Long.parseLong(res);
    }
    
    static boolean isPalindrome (String input, int low, int high) {
        if (low > high) return true;
        else {
            if (input.charAt(low) == input.charAt(high)) return isPalindrome(input, low += 1, high -= 1);
            else return false;
        }
    }
}
