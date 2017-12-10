import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p913 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String masukan = input.readLine();
        while(masukan != null) {
            long n = Long.parseLong(masukan);
            long ganjilTerakhir = (n*(n+2))/2;
            long hasil = (ganjilTerakhir*3)-6;
            System.out.println(hasil);
            masukan = input.readLine();
        }
    }
}
