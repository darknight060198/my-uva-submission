
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
public class p167 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        List<Position[]> hasil = solve(8);

        for (; k > 0; k--) {
            int[][] nilai = new int[8][8];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    nilai[i][j] = input.nextInt();
                }
            }
            
            Iterator<Position[]> it = hasil.iterator();
            int res = Integer.MIN_VALUE;
            
            while (it.hasNext()) {
                Position[] temp = it.next();
                int hasilTemp = 0;
                
                for (Position p : temp) {
                    hasilTemp += nilai[p.row][p.col]; 
                }
                
                if (hasilTemp > res) res = hasilTemp;
            }
            
            System.out.printf("%5d\n", res);
        }
    }

    static List<Position[]> solve(int n) {
        List<Position[]> result = new ArrayList<>();
        Position[] pos = new Position[n];
        solveRek(0, pos, result, n);
        return result;
    }

    static void solveRek(int curr, Position[] pos, List<Position[]> res, int n) {
        if (curr == n) {
            Position[] temp = Arrays.copyOf(pos, pos.length);
            res.add(temp);
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean safe = true;

            for (int j = 0; j < curr; j++) {
                if (pos[j].col == i || pos[j].col - pos[j].row == i - curr
                        || pos[j].col + pos[j].row == i + curr || pos[j].row == curr) {
                    safe = false;
                    break;
                }
            }

            if (safe) {
                pos[curr] = new Position(curr, i);
                solveRek(curr + 1, pos, res, n);
            }
        }
    }

    static class Position {

        int row, col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
