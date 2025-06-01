package StringBuilder;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //setCharAt
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        
        //insert
        sb.insert(0, 's');
        System.out.println(sb);

        //delet
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
