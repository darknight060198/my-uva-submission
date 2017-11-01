import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p272 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean status = true;
        while (true) {
            int temp = input.read();
			if (temp < 0) break;
			char c = (char)temp;
			if (c == '"') {
				if (status) {
					System.out.print("``");
					status = false;
				} else {
					System.out.print("''");
					status = true;
				}
			} else {
				System.out.print(c);
			}
		}
    }
}
