package Function.HomeWork;

import java.util.Scanner;

public class FunctionTable {
    public static void TableFunction(int num){
        int table;
        for (int i = 1; i<=10; i++){
            table = i*num;
            System.out.println(table);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        TableFunction(num);
    }
    
}
