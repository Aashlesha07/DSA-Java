package Conditions;

import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. age validate
        // int age = sc.nextInt();
        // if(age < 18){
        //     System.out.println("your not allow");
        // }
        // else{
        //     System.out.println("you are allow");
        // }

        // 2. odd even varification
        // int number = sc.nextInt();
        // int ans = number % 2;
        // if(ans == 0){
        //     System.out.println("its even number");
        // }
        // else{
        //     System.out.println("its odd number");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Both are equal");
        }
        else{
            if(a > b){
                System.out.println("a is grater then b");
            }
            else{
                    System.out.println("b is grater then a");
            }

        }
    }
}
