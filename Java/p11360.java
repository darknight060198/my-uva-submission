
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JASONYEHEZKIEL
 */
public class p11360 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 1; i <= kasus; i++) {
            int banyak = input.nextInt();
            int[][] data = new int[banyak][banyak];
            for (int j = 0; j < banyak; j++) {
                int tempmasukan = input.nextInt();
                for (int k = 0; k < banyak; k++) {
                    data[j][k] = tempmasukan % 10;
                    tempmasukan /= 10;
                }
            }

            int bykcomm = input.nextInt();
            for (int j = 0; j < bykcomm; j++) {
                String comm = input.next();
                switch (comm.charAt(0)) {
                    case 'r':
                        int rowA = input.nextInt();
                        int rowB = input.nextInt();
                        rowA--;
                        rowB--;
                        for (int k = 0; k < banyak; k++) {
                            int temp = data[rowA][k];
                            data[rowA][k] = data[rowB][k];
                            data[rowB][k] = temp;
                        }
                        break;
                    case 'c':
                        int colA = input.nextInt();
                        int colB = input.nextInt();
                        colA--;
                        colB--;
                        for (int k = 0; k < banyak; k++) {
                            int temp = data[k][colA];
                            data[k][colA] = data[k][colB];
                            data[k][colB] = temp;
                        }
                        break;

                    case 'i':
                        for (int k = 0; k < banyak; k++) {
                            for (int l = 0; l < banyak; l++) {
                                data[k][l]++;
                                if (data[k][l] > 9) {
                                    data[k][l] %= 10;
                                }
                            }
                        }
                        break;

                    case 'd':
                        for (int k = 0; k < banyak; k++) {
                            for (int l = 0; l < banyak; l++) {
                                data[k][l]--;
                                if (data[k][l] < 0) {
                                    data[k][l] += 10;
                                }
                            }
                        }
                        break;

                    case 't':
                        int[][] temp = new int[banyak][banyak];
                        for (int k = 0; k < banyak; k++) {
                            for (int l = 0; l < banyak; l++) {
                                temp[l][k] = data[k][l];
                            }
                        }

                        for (int k = 0; k < banyak; k++) {
                            for (int l = 0; l < banyak; l++) {
                                data[k][l] = temp[k][l];
                            }
                        }
                        break;

                }
            }

            System.out.printf("Case #%d\n", i);
            for (int k = 0; k < banyak; k++) {
                for (int l = 0; l < banyak; l++) {
                    System.out.printf("%d", data[k][l]);
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}