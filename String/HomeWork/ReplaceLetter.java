package String.HomeWork;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Replace Letter with e");

        for(int i = 0; i<word.length();i++){
            if (word.charAt(i)== 'e'){
                System.out.print("i");
            }else{
                System.out.print(word.charAt(i));
            }
        }
    }
    
}
