
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
public class p10530 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lie = false;
        while (true) {
            int num, max = 10, min = 1;
            num = input.nextInt();
            if (num == 0)break;
            String command = input.nextLine();
            command = input.nextLine();
            while (!command.equals("right on")) {
                if (command.equals("too high")) {
                  max = Math.min(max, num - 1);
                } else {
                  min = Math.max(min, num + 1);
                }
                num = Integer.parseInt(input.nextLine().trim());
                command = input.nextLine().trim();
              }

              if (num >= min && num <= max) {
                System.out.println("Stan may be honest");
              } else {
                System.out.println("Stan is dishonest");
              }

        }
    }
}
