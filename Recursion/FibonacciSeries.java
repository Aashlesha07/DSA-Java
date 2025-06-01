package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fiboSeries(int i,int n,int b){
        if (n == 0){
            return;
        }
    int c = i + b;
    System.out.print(c +"");
    fiboSeries(b, n-1, c);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int b = 1;
        System.out.print(i +"");
        System.out.print(b +"");
        fiboSeries(i, n-2, b);
    }
}
