package Array;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String nameArray[] = new String[size];

        for (int i=0; i <size; i++){
            nameArray [i] = sc.nextLine();
        }
        for (int i=0; i < size; i++){
            System.out.println(nameArray[i] + " ");
        }
    }
}
