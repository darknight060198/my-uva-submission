
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
public class p494 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String masukan = input.nextLine();
            int res = 0;
            for (int i = 0; i < masukan.length()-1; i++) {
                char temp = masukan.charAt(i);
                char temp1 = masukan.charAt(i+1);
                if (
                        ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) &&
                        ((temp1 < 'a' || temp > 'z') && (temp < 'A' || temp > 'Z'))
                    ) res++;
            }
            try{
                if (Character.isLetter(masukan.charAt(masukan.length()-1))) res++;
            }catch (StringIndexOutOfBoundsException e) {
            }
            System.out.println(res);
        }
    }
}
