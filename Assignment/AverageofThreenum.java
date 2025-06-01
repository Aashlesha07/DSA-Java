package Assignment;

import java.util.Scanner;

public class AverageofThreenum {
    public static void AverageNum(int a, int b, int c){
        int sum = a+b+c;
        int Avg = sum/3;
        System.out.println(Avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        AverageNum(a, b, c);
    }  
}
