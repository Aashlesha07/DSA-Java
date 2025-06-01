package Assignment;

import java.util.Scanner;

public class SumOfOddNum {
    public static int SumOfOddNum (int n){
        int sum = 0;
        for(int i = n; i>= 1; i--){
            if(i%2 != 0) {
                sum += i;
            }
        }
        
        return sum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = SumOfOddNum(n);
    System.out.println(sum);

}    
}
