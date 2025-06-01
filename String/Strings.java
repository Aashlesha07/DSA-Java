package String;

public class Strings {
   public static void main(String[] args) {
    //concatenation
    String name = "Aashlesha";
    String surname = "Kharunkar";
    String fullname = name + " "+surname;
    System.out.println(fullname.length());

    //charAt
    for(int i=0;i<fullname.length();i++ ){
        System.out.println(fullname.charAt(i));
    }
}
}
        

