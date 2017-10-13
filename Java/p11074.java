import java.util.Scanner;

public class p11074 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		while (true) {
			String res = "";
		   int s = input.nextInt();
		   int t = input.nextInt();
		   int n = input.nextInt();
		   if (s == 0 && t == 0 && n == 0) break;
		   int i,j,k,l;
		   res += String.format("Case %d:\n", counter);
		   int max = (s*n) + (t*(n+1));
		   for (i = 0; i < t; i++) {
			   for (j = 0; j < max; j++) {
				   res += "*";
			   }
			   res += "\n";
		   }
		   
		   for (i = 0; i < n; i++) {
			   for (j = 0; j < s; j++) {
				   for (k = 0; k < t; k++) {
					   res += "*";
				   }
				   
				   for (k = 0; k < n; k++) {
					   for (l = 0; l < s; l++) {
						   res += ".";
					   }
					   
					   for (l = 0; l < t; l++) {
						   res += "*";
					   }
				   }
				   
				   res += "\n";
			   }
			   
			   for (j = 0; j < t; j++) {
				   for (k = 0; k < max; k++) {
					   res += "*";
				   }
				   res += "\n";
			   }
		   }
		counter++;
		System.out.println(res);
	   }
	}
}