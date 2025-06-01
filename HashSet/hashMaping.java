package HashSet;
import java.util.*;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;

public class hashMaping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>() ;

        //insert
        map.put("india", 1230);
        map.put("usa", 1000);
        map.put("austrelia", 600);

        System.out.println(map);

        map.put("chaina", 3000); // insert new value
        map.put("india", 1500); // update the value
        System.out.println(map);

        //search
        if(map.containsKey("usa")){
            System.out.println("its exist0");
        }else{
            System.out.println("its does not exit");
        }

        if(map.containsKey("indosia")){
            System.out.println("its exist0");
        }else{
            System.out.println("its does not exit");
        }
        //get value by key
        System.out.println(map.get("austrelia")); // key exist
        System.out.println(map.get("indosia")); //key not exist

        //iterator
        // for (int value: collection);
        for( Map.Entry<String, Integer>e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //another way
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + map.get(key));
        }

        //delete 
        map.remove("chaina");
        System.out.println(map);
    }
}
