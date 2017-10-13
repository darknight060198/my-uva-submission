
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
public class p11547 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int num = input.nextInt();
            String res = Integer.toString(automaticAnswer(num));
            System.out.println(res.charAt(res.length()-2));
        }
    }
    
    static int automaticAnswer (int num) {
        return ((((((num*567)/9)+ 7492)*235)/47)-498);
    }
}
