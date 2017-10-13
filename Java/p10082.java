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
public class p10082 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, keyboard;
        int len;
        keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        while (sc.hasNext()) {
            str = sc.nextLine();
            len = str.length();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i)) - 1));
                }
            }
            System.out.println();
        }
    }
}
