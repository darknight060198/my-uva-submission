
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p10107 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        while (input.hasNext()) {
            int num = input.nextInt();
            data.add(num);
            Collections.sort(data);
            if (data.size() % 2 == 0) {
                int temp = ((data.size() + 1) / 2) - 1;
                int median = (data.get(temp) + data.get(temp + 1)) / 2;
                System.out.println(median);
            } else {
                int median = data.get(((data.size() + 1) / 2) - 1);
                System.out.println(median);
            }
        }
    }
}
