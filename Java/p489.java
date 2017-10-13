
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p489 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int round = input.nextInt();
            if (round == -1) break;
            String asal = input.next();
            asal = removeDuplicate(asal);
            String tebakan = input.next();
            tebakan = removeDuplicate(tebakan);
            int stroke = 7, tebak = 0;
            boolean win = false, chicken = false;
            for (int i = 0; i < tebakan.length(); i++) {
                if (asal.contains(tebakan.charAt(i)+"")) {
                    tebak++;
                } else {
                    stroke--;
                }
                
                if (stroke == 0) {
                    break;
                }
                
                if(tebak == asal.length()) {
                    win = true;
                    break;
                }
            }
            if(stroke != 0 && tebak != asal.length()) chicken = true;
            
            System.out.println("Round " + round);
            if (chicken) {
                System.out.println("You chickened out.");
            } else {
                if (win) {
                    System.out.println("You win.");
                } else {
                    System.out.println("You lose.");
                }
            }
        }
    }
    
    static String removeDuplicate(String input) {
        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        charSet.stream().forEach((character) -> {
            sb.append(character);
        });
        
        return sb.toString();
    }
}
