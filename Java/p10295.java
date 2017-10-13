import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class p10295 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap <String, Double> kamus = new HashMap<>();
		String [] temp = input.readLine().split(" ");
		int banyak = Integer.parseInt(temp[0]);
		int kalimat = Integer.parseInt(temp[1]);
		
		for (int i = 0; i < banyak; i++) {
			temp = input.readLine().split(" ");
			kamus.put(temp[0], Double.parseDouble(temp[1]));
		}
		
		for (int i = 0; i < kalimat; i++) {
			long res = 0;
			while (true) {
				temp = input.readLine().split(" ");
				if (temp[0].equals(".")) break;
				for (int j = 0; j < temp.length; j++) {
					if (kamus.containsKey(temp[j])) {
						res += kamus.get(temp[j]);
					}
				}
			}
			
			System.out.println(res);
		}
	}
}