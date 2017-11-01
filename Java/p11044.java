import java.util.Scanner;  

public class p11044 {  
      static int testCases;  
      static int val1, val2;  
      public static void main(String[] args) {  
           Scanner scanner = new Scanner(System.in);  
           testCases = scanner.nextInt();  
           while((testCases--) != 0) {  
                val1 = scanner.nextInt();  
                val2 = scanner.nextInt();  
                val1 = val1/3;  
                val2 = val2/3;  
                System.out.println(val1 * val2);  
           }  
           scanner.close();  
      }  
 }  