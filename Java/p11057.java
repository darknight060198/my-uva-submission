
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DarKnight98
 */
public class p11057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = 0;
        while (input.hasNext()) {
            if (test != 0) input.nextLine();
            int banyak = input.nextInt();
            int[] ganteng = new int[1000001];
            for (int i = 0; i < banyak; i++) {
                ganteng[input.nextInt()]++;
            }

            int target = input.nextInt();
            if (target % 2 == 0) {
                if (ganteng[target / 2] >= 2) {
                    System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", target / 2, target / 2);
                } else {
                    doIt(ganteng, target);
                }
            } else {
                doIt(ganteng, target);
            }

//            try {
//                input.nextLine();
//            } catch (Exception e) {
//                System.out.println("FAILED");
//            }
//            System.out.println("");
            test++;
        }
    }

    static void doIt(int[] ganteng, int target) {
        int temp1 = target / 2;
        int temp2 = temp1 + 1;

        if (target%2 == 0) {
            temp1--;
        }
        
        while (temp1 >= 1) {
            if (ganteng[temp1] != 0 && ganteng[temp2] != 0) {
                System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", temp1, temp2);
                return;
            }
            temp1--;
            temp2++;
        }
    }
}
