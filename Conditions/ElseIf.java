package Conditions;

import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b){
        //     System.out.println("Both are equal");
        // }
        // else if(a > b){
        //     System.out.println("a is grater then b");
        //     }
        // else{
        //     System.out.println("b is grater then a");
        //     }

        int button =sc.nextInt();

        if (button == 1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namste");
        }
        else if (button == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid");
        }
    }  
}
