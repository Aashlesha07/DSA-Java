package Conditions.Homework;

import java.util.*;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month =sc.nextInt();

        switch(month){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("Jully");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("Saptember");
            break;
            case 10 : System.out.println("Octomber");
            break;
            case 11: System.out.println("Novamber");
            break;
            case 12: System.out.println("Desember");
            break;
            default : System.out.println("Invalid month");
        }
    }
}
