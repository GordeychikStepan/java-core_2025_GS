package timus.Task30_1110_210426;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int modPow(int x, int n, int m) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * x) % m;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> answer = new ArrayList<>();

        for (int x = 0; x < m; x++) {
            if (modPow(x, n, m) == y) {
                answer.add(x);
            }
        }

        if (answer.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < answer.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(answer.get(i));
            }
        }
    }
}
