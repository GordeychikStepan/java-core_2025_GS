package timus.Task28_1025_210426;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] groups = new int[k];

        for (int i = 0; i < k; i++) {
            groups[i] = sc.nextInt();
        }

        Arrays.sort(groups);

        int needGroups = k / 2 + 1;
        int answer = 0;

        for (int i = 0; i < needGroups; i++) {
            answer += groups[i] / 2 + 1;
        }

        System.out.println(answer);
    }
}
