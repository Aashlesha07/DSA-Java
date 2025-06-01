package Array;

import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numArray[] = new int[size];

        for (int i=0; i<size;i++){
            numArray[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // Find maximum value
        for (int i=0; i<size; i++){
            if(numArray[i] < min) {
                min = numArray[i];
            }
            if(numArray[i] > max) {
                max = numArray[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
