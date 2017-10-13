
import java.util.Scanner;

public class p10878 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String masukan = input.nextLine();
        
        while (true) {
            masukan = input.nextLine();
            int asciiNum = 0;
            char res;
            String binary = "";
            
            if (masukan.charAt(0) == '_') break;
            
            for (int i = 1; i < masukan.length()-1; i++) {
                switch (masukan.charAt(i)) {
                    case ' ':
                        binary += "0";
                        break;
                    case 'o':
                        binary += "1";
                        break;
                    default:
                }
            }
            
            asciiNum = Integer.parseInt(binary,2);
            res = (char)asciiNum;
            System.out.print(res);
        }
    }
}
