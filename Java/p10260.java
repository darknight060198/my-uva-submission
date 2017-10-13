import java.util.Scanner;

public class p10260 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String masukan = input.nextLine();
			int sebelum = -5;
			String res = "";
			for (int i = 0; i < masukan.length(); i++) {
				int temp = konvertHuruf(masukan.charAt(i));
				if (temp == sebelum) continue;
				else {
					if (temp != 0) {
						res += temp+"";
						sebelum = temp;
					} else {
						sebelum = -5;
					}
				}
			}
			
			System.out.println(res);
		}
	}
	
	static int konvertHuruf(char c) {
		switch (c) {
			case 'B' :
				return 1;
			case 'F' :
				return 1;
			case 'P' :
				return 1;
			case 'V' :
				return 1;
			case 'C' :
				return 2;
				 
			case 'G' :
				return 2;
				 
			case 'J' :
				return 2;
				 
			case 'K' :
				return 2;
				 
			case 'Q' :
				return 2;
				 
			case 'S' :
				return 2;
				 
			case 'X' :
				return 2;
				 
			case 'Z' :
				return 2;
				 
			case 'D' :
				return 3;
				 
			case 'T' :
				return 3;
				 
			case 'L' :
				return 4;
				 
			case 'M' :
				return 5;
				 
			case 'N' :
				return 5;
				 
			case 'R' :
				return 6;
				 
			default:
				return 0;
		}
	}
}