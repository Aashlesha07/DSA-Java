package Function;

import java.util.*;

public class Factorial {
    public static void FactorialOfNum (int num) {
        int factorial = 1;

    if (num <= 0){
        System.out.println("enter vaild number");
    }else if (num >= 0){
        for (int i = num; i>=1; i--){
            factorial = factorial*i;
       }
       System.out.println(factorial);
       return;
    }    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        FactorialOfNum(num);
    }
    
}
