
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
public class p10921 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String res = "";
            String masukan = input.nextLine();
            for (int i = 0; i < masukan.length(); i++) {
                switch (masukan.charAt(i)) {
                    case 'A' :
                        res += "2";
                        break;
                    case 'B':
                        res += "2";
                        break;
                    case 'C' :
                        res += "2";
                        break;
                    case 'D':
                        res += "3";
                        break;
                    case 'E' :
                        res += "3";
                        break;
                    case 'F' :
                        res += "3";
                        break;
                    case 'G' :
                        res += "4";
                        break;
                    case 'H' :
                        res += "4";
                        break;
                    case 'I' :
                        res += "4";
                        break;
                    case 'J' :
                        res += "5";
                        break;
                    case 'K' :
                        res += "5";
                        break;
                    case 'L' :
                        res += "5";
                        break;
                    case 'N' :
                        res += "6";
                        break;
                    case 'M' :
                        res += "6";
                        break;
                    case 'P' :
                        res += "7";
                        break;
                    case 'Q' :
                        res += "7";
                        break;
                    case 'R':
                        res += "7";
                        break;
                    case 'S' :
                        res += "7";
                        break;
                    case 'T' :
                        res += "8";
                        break;
                    case 'U':
                        res += "8";
                        break;
                    case 'V' :
                        res += "8";
                        break;
                    case 'W':
                        res += "9";
                        break;
                    case 'X':
                        res += "9";
                        break;
                    case 'Y':
                        res += "9";
                        break;
                    case 'Z' :
                        res += "9";
                        break;
                    case '-' :
                        res += "-";
                        break;
                    case '1' :
                        res += "1";
                        break;
                    case '0' :
                        res += "0";
                        break;
                    default:
                        res += "6";
                        break;
                }
            }
            
            System.out.println(res);
        }
    }
}
