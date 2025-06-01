package Assignment;

import java.util.Scanner;

public class RaisedPower {
    public static int raisePower(int x, int n) {
        int power = 1;
        for(int i = 1; i <= n ; i++){
            power = x*power;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int  x = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int power = raisePower(x, n);
        System.out.println(power);
    }
}
