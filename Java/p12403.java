import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12403 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine()), res = 0;
        for (int i = 0; i < tc; i++) {
            String [] masukan = input.readLine().split(" ");
            if (masukan[0].equals("donate")) {
                res += Integer.parseInt(masukan[1]);
            } else {
                System.out.println(res);
            }
        }
    }
}
