package String.HomeWork;

import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            System.out.println("email is");
             
            for (int i = 0; i<email.length();i++){
                if (email.charAt(i) == '@'){
                    break;
                }else{
                    System.out.print(email.charAt(i));
                }
            }
        
    }
}
