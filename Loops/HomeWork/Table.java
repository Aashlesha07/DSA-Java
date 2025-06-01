package Loops.HomeWork;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table = 0;
        int i = 1;

        // for(int i = 1 ; i <=10 ; i++){
        //     table = num*i;
        //     System.out.println(table);
        // }

        while (i <= 10) {
            table = num * i;
            System.out.println(table); 
            i++;
        }

    }
}
