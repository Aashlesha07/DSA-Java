package Assignment;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int fibonacci = 0;
        int prev2 = 1;
        for (int i=0; i<=n; i++){
           
            if (i== 0){
               fibonacci = prev; 
            }else if (i == 1){
                fibonacci = prev2;
            }else{
                fibonacci = prev +prev2;
                prev = prev2;
                prev2 = fibonacci;
            }
            System.out.print(fibonacci);
            System.out.print(" ");
        }

    }
}
