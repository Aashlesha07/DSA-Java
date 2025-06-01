package Assignment;

import java.util.Scanner;

public class GCDofTwoNum {
    public static void GCD(int a, int b){
        while(a != b) { 
            if(a>b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD is :"+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

        GCD(a, b);
        
    }
    
}
