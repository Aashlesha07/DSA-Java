package Assignment;

import java.util.Scanner;

public class GreaterNum {
    public static void GreaterNum(int a, int b){
        if (a < b){
            System.out.println(b +" is grater than "+a );
        }else if(a > b){
            System.out.println(a+ " is greater then " +b);
        }else{
            System.out.println("invalid");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GreaterNum(a, b);
    }
    
}
