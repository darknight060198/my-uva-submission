
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
public class p10443 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int r = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            char[][] data = new char[r][c];

            for (int j = 0; j < data.length; j++) {
                data[j] = input.next().toCharArray();
            }

            char[][] res = new char[r][c];
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data[j].length; k++) {
                    res[j][k] = data[j][k];
                }
            }
            
            for (int l = 0; l < d; l++) {
                for (int j = 0; j < data.length; j++) {
                    for (int k = 0; k < data[j].length; k++) {
                        if (j == data.length - 1 && k != data[j].length-1) {
                            if (data[j][k] != data[j][k+1]) {
                                if (cekMenang(data[j][k], data[j][k+1])) {
                                    res[j][k+1] = data[j][k];
                                } else {
                                    res[j][k] = data[j][k+1];
                                }
                            }
                        } else {
                            if (k != data[j].length-1) {
                                if (data[j][k] != data[j][k+1]) {
                                    if (cekMenang(data[j][k], data[j][k+1])) {
                                        res[j][k+1] = data[j][k];
                                    } else {
                                        res[j][k] = data[j][k+1];
                                    }
                                }
                                if (data[j][k] != data[j+1][k]) {
                                    if (cekMenang(data[j][k], data[j+1][k])) {
                                        res[j+1][k] = data[j][k];
                                    } else {
                                        res[j][k] = data[j+1][k];
                                    }
                                }
                            } else {
                                if (j == data.length - 1) break;
                                if (data[j][k] != data[j+1][k]) {
                                    if (cekMenang(data[j][k], data[j+1][k])) {
                                        res[j+1][k] = data[j][k];
                                    } else {
                                        res[j][k] = data[j+1][k];
                                    }
                                }
                            }
                        }
                    }
                }
                for (int j = 0; j < data.length; j++) {
                    for (int k = 0; k < data[j].length; k++) {
                        data[j][k] = res[j][k];
                    }
                }
            }
            
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data[j].length; k++) {
                    System.out.print(res[j][k]);
                }
                System.out.println();
            }
            
            if (! (i == kasus-1))System.out.println();
        }
    }

    static boolean cekMenang(char char1, char char2) {
        if (char1 == 'R') {
            if (char2 == 'R' || char2 == 'S') {
                return true;
            } else {
                return false;
            }
        } else if (char1 == 'S') {
            if (char2 == 'S' || char2 == 'P') {
                return true;
            } else {
                return false;
            }
        } else {
            if (char2 == 'P' || char2 == 'R') {
                return true;
            } else {
                return false;
            }
        }
    }
}
