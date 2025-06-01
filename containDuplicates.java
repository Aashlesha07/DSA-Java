// Given an array of integers, find if it contains any duplicates.

import java.util.Scanner;

public class containDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            int prev = arr[i-1];
            if (arr[i] == ){
                count++;
            }
        }
        System.out.println(count);
    }
}
