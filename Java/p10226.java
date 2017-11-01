import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class p10226 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(input.readLine());
		boolean status = true;
		
		for (int i = 0; i < tc; i++) {
		    int totalTumbuhan = 0;
			HashMap<String, Integer> data = new HashMap<>();
			if (status) {
				input.readLine();
				status = false;
			}
			
			while (true) {
				String temp = input.readLine();
				try{
				    if (temp.equals("") || temp == null) break;
				} catch(NullPointerException e) {
				    break;
				}
				
				if (data.get(temp) == null) {
				    data.put(temp, 1);
				} else {
				    data.put(temp, data.get(temp)+1);
				}
				totalTumbuhan++;
			}
			
			Map<String, Integer> data2 = new TreeMap<String, Integer>(data);
			Set set = data2.entrySet();
			Iterator it = set.iterator();
			while (it.hasNext()) {
			    Map.Entry temp = (Map.Entry)it.next();
			    double total = ((int)temp.getValue())*1.0;
			    total /= totalTumbuhan;
			    total *= 100;
			    System.out.printf("%s %.4f\n", temp.getKey(), total);
			}
			
			if (i != tc-1) System.out.println();
		}
	}
}