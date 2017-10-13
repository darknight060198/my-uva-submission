
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight060198
 */
public class p10420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        Map<String, Integer> data = new HashMap<>();
        for (int i = 0; i < kasus; i++) {
            String negara = input.next();
            if (data.get(negara) == null) {
                data.put(negara, 1);
            } else {
                data.put(negara, data.get(negara)+1);
            }
            negara = input.nextLine();
        }
        Map<String, Integer> sortedData = new TreeMap<>(data);
        sortedData.keySet().stream().forEach((name) -> {
            int value = sortedData.get(name);
            System.out.println(name + " " + value);
        });
    }
}
