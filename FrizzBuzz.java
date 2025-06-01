public class FrizzBuzz {
    public static void mul(int i){
        
        if (i%3 == 0 && i%5 == 0){
            System.out.print("FrizzBuzz " );
        }else if (i%3 == 0){
            System.out.print("frizz ");
        }else if(i%5 == 0){
            System.out.print("buzz ");
        }else {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
          
            mul(i);
        }
    }
}
