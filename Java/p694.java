
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, limit, terms = 1, i = 1;
        long temp;
        while (true) {
        	a = input.nextInt();
        	limit = input.nextInt();
        	if (a < 0 && limit < 0) break;
        	temp = a;
        	while (temp != 1) {
        		if (temp%2 == 0) {
        			temp /= 2;
    			} else {
    				temp = 3 * temp + 1;
    			}
        		if ( temp > 2147483647 || temp > limit ) {
        			break;
    			}
    			terms++;
    		}
    		
    		System.out.printf("Case %d: A = %d, limit = %d, number of terms = %d\n", i, a, limit, terms);
    		
    		i++;
    		terms = 1;
    	}
    }
}
