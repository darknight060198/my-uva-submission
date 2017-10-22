
import java.util.HashSet;
import java.util.Iterator;
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
public class p10815 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> hasil = new HashSet<>();
        
        while (input.hasNext()) {
            String masukan = input.next();
            String current = "";
            for (int i = 0; i < masukan.length(); i++) {
                char c = Character.toLowerCase(masukan.charAt(i));
                if (isLowerChar(c)) current += (c + "");
                else if (current.isEmpty()) {
                    hasil.add(current);
                    current = "";
                }
            }
            
            if (current.isEmpty()) hasil.add(current);
        }
        
        Iterator<String> it = hasil.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    static boolean isLowerChar (char c) {
        return c >= 'a' && c <= 'z';
    }
}
