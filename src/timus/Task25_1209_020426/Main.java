package timus.Task25_1209_020426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long k = Long.parseLong(br.readLine().trim());

            long value = 8L * k - 7;
            long root = (long) Math.sqrt(value);

            while ((root + 1) * (root + 1) <= value) {
                root++;
            }
            while (root * root > value) {
                root--;
            }

            int digit = (root * root == value) ? 1 : 0;

            if (i > 0) {
                answer.append(' ');
            }
            answer.append(digit);
        }

        System.out.println(answer);
    }
}
