package Loops.HomeWork;

import java.util.*;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i ++) {
            if(i%2 == 0){
            System.out.println(i);
            }
        }

        // for(; ;) {
        //     System.out.println("Apna College");
        // }

    }
}
