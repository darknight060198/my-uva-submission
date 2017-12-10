import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int kasus = Integer.parseInt(input.readLine());
        for (int i = 0; i < kasus; i++) {
            String kata = input.readLine();
            int q = Integer.parseInt(input.readLine());
            for (int j = 0; j < q; j++) {
                String temp = input.readLine();
                if (kata.contains(temp)) System.out.println("y");
                else System.out.println("n");
            }
        }
    }
}
