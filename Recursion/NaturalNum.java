package Recursion;

import java.util.Scanner;


public class NaturalNum {
    public static void sumOfNatural(int i, int n, int sum){
        
        if (i == n ){
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNatural(i+1, n, sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumOfNatural(0, sc.nextInt(), 0);
        
    }
}
