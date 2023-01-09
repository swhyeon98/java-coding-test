package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> score = new HashMap<>();
        int sum = 0;

        for (int i = 1; i <= 8; i++) {
            score.put(i, Integer.parseInt(br.readLine()));
        }

        List<Integer> number = new ArrayList<>(score.values());
        Collections.sort(number);

        for (int index = 7; index > 2; index--) {
            sum += number.get(index);
        }

        System.out.println(sum);
        System.out.println(score);

//        for (int index = 3; index < 8; index++) {
//            System.out.print(number.get(index) + " ");
//            System.out.print(score.get(number.get(index))+" ");
//        }
    }
}
