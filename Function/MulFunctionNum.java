package Function;
import java.util.*;

public class MulFunctionNum {
    public static int MulofNumber(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = MulofNumber(a, b);
        System.out.println(product);


    }
    
}
