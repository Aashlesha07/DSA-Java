package FifthClass.HomeWork;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--){
            for (int j = n-1 ; j <= n; j++){
                System.out.print("* ");
            }
            // for(int j=1; j<=n; j++){
            //     System.out.print("*");
            // }
            System.out.println(" " );
        }  
    }
    
}
