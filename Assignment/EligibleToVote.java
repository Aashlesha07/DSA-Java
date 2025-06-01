package Assignment;

import java.util.Scanner;

public class EligibleToVote {
    public static String voteEligible(int age){
        // if (age >= 18){
        //     System.out.println("your eligible for Vote");
        // }else {
        //     System.out.println("you are not eligible for vote");
        // }

        return (age>18)?"Yes":"NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(voteEligible(age));
    }
    
}
