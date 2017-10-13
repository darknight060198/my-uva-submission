import java.util.Scanner;
import java.util.Stack;

/**
 * Kelas ini untuk menguji apakah sekumpulan tanda kurung merupakan tanda kurung yang valid
 * 
 * @author DarKnight98
 */
public class p673
{
    /**
     * Tester untuk menguji keluaran apakah tanda kurung valid
     */
    
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            String kata = input.next();
            PengujiKurung solver = new PengujiKurung(kata);
            if (solver.cekValid()) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    
    /**
     * Kelas solver untuk masalah ini
     */
    static class PengujiKurung {
        private Stack <Character> data;         //stack untuk membantu penyelesaian masalah
        private String kata;                    //kata yang berisi tanda kurung yang akan dicek
        
        /**
         * Constructor
         * @param   kata - kata yang akan diperiksa
         */
        public PengujiKurung (String kata) {
            this.kata = kata;
            this.data = new Stack<>();
        }
        
        /**
         * menguji apakah tanda kurungnya valid
         * @return  true jika tanda kurung valid
         */
        private boolean cekValid () {
            for (int i = 0; i < kata.length(); i++) {
                switch (kata.charAt(i)) {
                    case ')' :
                        if (data.isEmpty() || data.peek() != '(') {
                            return false;
                        } else {
                            data.pop();
                        }
                        break;
                    case ']' :
                        if (data.isEmpty() || data.peek() != '[') {
                            return false;
                        } else{
                            data.pop();
                        }
                        break;
                    case '}' :
                        if (data.isEmpty() || data.peek() != '{') {
                            return false;
                        } else {
                            data.pop();
                        }
                        break;
                    default :
                        data.push(kata.charAt(i));
                }
            }
            
            if (!data.isEmpty()) return false;
            return true;
        }
    }
}