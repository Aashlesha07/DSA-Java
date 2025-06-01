package Array;

import java.util.Scanner;

public class MarksArray {
    public static void main(String[] args) {
//predefine Arry

        // int[] marks = new int[3];
        // marks[0] = 91;
        // marks[1] = 97;
        // marks[2] = 95;

        // int marks[]={91, 97,95};


        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i=0; i<3;i++){
        //     System.out.println(marks[i]);
        // 

    //userdefine Arry
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[]= new int[size];

        for(int i=0 ; i < size; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<size;i++){
               System.out.print(marks[i] + " ");
        }
}
}
