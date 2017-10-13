
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
public class p11498 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int kasus = input.nextInt();
            if (kasus == 0) break;
            int divX = input.nextInt();
            int divY = input.nextInt();
            for (int i = 0; i < kasus; i++) {
                int x = input.nextInt();
                int y = input.nextInt();
                if (x > divX) {
                    if (y > divY) {
                        System.out.println("NE");
                    } else if (y == divY) {
                        System.out.println("divisa");
                    } else {
                        System.out.println("SE");
                    }
                } else if (x == divX) {
                    System.out.println("divisa");
                } else {
                    if (y > divY) {
                        System.out.println("NO");
                    } else if (y == divY) {
                        System.out.println("divisa");
                    } else {
                        System.out.println("SO");
                    }
                }
            }
        }
    }
}
