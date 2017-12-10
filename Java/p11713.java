import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p11713 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(input.readLine());
		for(int i = 0; i < tc; i++) {
		    String first = input.readLine();
		    String second = input.readLine();
		    if (first.length() != second.length()) {
		        System.out.println("No");
		    } else {
				int length = first.length();
				boolean status = true;
				for (int j = 0; j < length; j++) {
				    if (!isVowel(first.charAt(j)) || !isVowel(second.charAt(j))) {
				        if (first.charAt(j) != second.charAt(j)) {
				            System.out.println("No");
				            status = false;
				            break;
				        }
				    }
				}
				
				if (status) {
				    System.out.println("Yes");
				}
			}
		}
	}
	
	static boolean isVowel(char c) {
	    return c == 'a' || c == 'i' || c == 'u' || c =='e' || c == 'o';
	}
}