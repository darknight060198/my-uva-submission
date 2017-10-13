import java.util.Scanner;

public class p401 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String kata = input.next();
            boolean palindromeCheck = isPalindrome(kata, 0, kata.length()-1);
            boolean mirrorCheck = isMirrored(kata, 0, kata.length()-1);
            if (palindromeCheck) {
                if (mirrorCheck) {
                    System.out.println(kata + " -- is a mirrored palindrome.\n");
                } else {
                    System.out.println(kata + " -- is a regular palindrome.\n");
                }
            } else {
                if (mirrorCheck) {
                    System.out.println(kata + " -- is a mirrored string.\n");
                } else {
                    System.out.println(kata + " -- is not a palindrome.\n");
                }
            }
        }
    }
    
    static boolean isPalindrome (String kata, int low, int high) {
        if (low > high) return true;
        else {
            if (kata.charAt(low) == kata.charAt(high)) return isPalindrome(kata, low += 1, high -= 1);
            else return false;
        }
    }
    
    static boolean isMirrored (String kata, int low, int high) {
        if (low > high) return true;
        else {
            if (cekMirror(kata.charAt(low),kata.charAt(high)))
                return isMirrored(kata, low += 1, high -= 1);
            else return false;
        }
    }
   
    static boolean cekMirror (char asal, char pembanding) {
        if ((asal == 'E' && pembanding == '3') || (asal == '3' && pembanding == 'E')) return true;
        else if ((asal == 'J' && pembanding == 'L') || (asal == 'L' && pembanding == 'J')) return true;
        else if ((asal == 'S' && pembanding == '2') || (asal == '2' && pembanding == 'S')) return true;
        else if ((asal == 'Z' && pembanding == '5') || (asal == '5' && pembanding == 'Z')) return true;
        else if (asal == 'A' || asal == 'H' || asal == 'I' || asal == 'M' || asal == 'O'
            || asal == 'T' || asal == 'U' || asal == 'V' || asal == 'W' || asal == 'X'
            || asal == 'Y' || asal == '1' || asal == '8') {
                if (asal == pembanding) return true;
                else return false;
            }
        else return false;
    }
}