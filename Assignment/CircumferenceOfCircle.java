package Assignment;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double CircumferenceCircle(int r){
        double circumference = 2*3.14 * r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();

        double circumference = CircumferenceCircle(r);
        System.out.printf("%.2f",circumference);
    }
    
}
