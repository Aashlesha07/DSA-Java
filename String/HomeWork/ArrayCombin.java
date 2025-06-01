package String.HomeWork;

import java.util.Scanner;

public class ArrayCombin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String nameArray[]=new String[size];
    int total = 0;

    for (int i=0; i<size; i++){
        nameArray[i] = sc.nextLine();
    }
    for (int i=0; i<size; i++){
        total += nameArray[i].length();
    }
    System.out.println(total);

    }
    

   
}
