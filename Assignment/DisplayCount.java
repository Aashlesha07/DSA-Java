package Assignment;

import java.util.Scanner;

public class DisplayCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt(); 

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Enter another number? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("\nCount of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        sc.close();
    }
}