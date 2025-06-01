package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        // System.out.println("size of set is" + set.size());

        //print set
        // System.out.println("set is : " + set);

        //search-contains
        // if(set.contains(1)){
        //     System.out.println("Its contains 1");
        // }
        //  if (!set.contains(6)){
        //     System.out.println("Is not contain 6");
        // }

        //delete
        // set.remove(1);
        // if (!set.contains(1)){
        //     System.out.println("we remove 1");
        // }

        // System.out.println("size of set is" + set.size());

        Iterator it = set.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
