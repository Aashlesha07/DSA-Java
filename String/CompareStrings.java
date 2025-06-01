package String;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = "sam";
        String name2 = "sam";
        
        if(name1.compareTo(name2)==0){
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }
    }
}
