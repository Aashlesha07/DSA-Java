package Loops.HomeWork;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for continue and 0 for stop");
        int num = sc.nextInt();
        int marks;
       

        if(num == 1){
            System.out.println("enter marks out of 100");
            marks = sc.nextInt();
            do {
                if (marks >=90 && marks <= 100) {
                    System.out.println("This is good");
                }else if(89 >= marks && marks >= 60){
                    System.out.println( "This is also Good");
                }else if(59 >= marks && marks >= 0){
                    System.out.println("This is Good as well");
                }
            }while(marks <= 0);
        }
        else if (num == 0){
            System.out.println("stop");
        }else{
            System.out.println("Invalid");
        }
    }
}
