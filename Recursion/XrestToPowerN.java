package Recursion;

import java.util.Scanner;

class Recursion1 {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int x_ = printPower(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int output = printPower(x, n);
        System.out.println(output);
    }
}