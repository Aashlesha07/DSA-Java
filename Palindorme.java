import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());

    for(int i = 0; i<=sb.length()/2; i++){
        int fornt = i;
        int back = sb.length()-i-1;

        char frontchar = sb.charAt(fornt);
        char backchar = sb.charAt(back);

        if(frontchar == backchar){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrom");
        }
    }
    }
}
