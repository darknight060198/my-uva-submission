import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12403 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;
        while (true) {
            String masukan = input.readLine();
            if (masukan.equals("*")) break;
            else if (masukan.equals("Hajj")) {
                System.out.printf("Case %d: Hajj-e-Akbar\n", tc++);
            } else {
                System.out.printf("Case %d: Hajj-e-Asghar\n", tc++);
            }
        }
    }
}
