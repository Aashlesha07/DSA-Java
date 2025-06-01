package Conditions.Homework;

import java.util.*;

public class Calculater {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double sum = a+b;
       double sub = a-b;
       double mul = a*b;
       double div = a/b;
       double mod = a%b;
       
       System.out.println("Sum = 1 ; sub = 2 ; mul = 3 ; div = 4 ; mod = 5");
       int num = sc.nextInt();
       switch (num){
        case 1 : System.out.println(sum);
        break;
        case 2 : System.out.println(sub);
        break;
        case 3 : System.out.println(mul);
        break;
        case 4 : if( b==0){
            System.out.println("invalid b value ");
        }else{
            System.out.println(div);
        };
        break;
        case 5 : if( b==0){
            System.out.println("invalid b value ");
        }else{
            System.out.println(mod);
        };
        break;
        default : System.out.println("Invalid");
       }
    }
}
