package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorialNum (int n ){
        if(n == 1 || n==0){
            return 1;
        }
        int sub = n-1;
        int Facto = n*sub;
        return Facto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorialNum(n);
        System.out.println(ans);
    }
}
