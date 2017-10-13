import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p443 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int [] humble = new int[5842];
		int pos2 = 0, pos3 = 0, pos5 = 0, pos7 = 0;
		humble[0] = 1;
		
		for(int i=1;i<5842;i++){
			humble[i]=Math.min(Math.min(2*humble[pos2],3*humble[pos3]),Math.min(5*humble[pos5],7*humble[pos7]));
			
			if(humble[i]==2*humble[pos2]) pos2++;
			if(humble[i]==3*humble[pos3]) pos3++;
			if(humble[i]==5*humble[pos5]) pos5++;
			if(humble[i]==7*humble[pos7]) pos7++;
		}
		
		while (true) {
			int n = Integer.parseInt(input.readLine());
			if (n==0) break;
			
			System.out.print("The " + n);
			if(n%10==1 && (n/10)%10!=1) System.out.print("st");
			else if(n%10==2 && (n/10)%10!=1) System.out.print("nd");
			else if(n%10==3 && (n/10)%10!=1) System.out.print("rd");
			else System.out.print("th");
			
			System.out.printf(" humble number is %d.\n",humble[n-1]);
		}
	}
}