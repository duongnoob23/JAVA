package demo;

import java.util.Scanner;

public class J01022XauNhiPhan {

    public static Scanner sc = new Scanner(System.in);
    public static long[] p = new long[93];

    public static void fibo1() {
        p[1] = 1L;
        p[2] = 1L;
        for (int i = 3; i < 93; i++) {
            p[i] = p[i - 1] + p[i - 2];
        }
    }

    public static long XNP(int a, long b) {
        if (a == 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        long m = p[a - 2];
        if (b > m) {
            return XNP(a - 1, b - m);
        } else {
            return XNP(a - 2, b);
        }
    }

    public static void main(String[] args) {
        fibo1();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(XNP(n, k));
        }
    }
}

// 0 1 01 101 01101 101/01101
// 1 2 3  4   5     6
