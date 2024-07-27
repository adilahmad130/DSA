import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String args[]){
        // Country(key), Population(value)
        HashMap<String,Integer> map = new HashMap<>();
        
        // Insertion

        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China",180);
        System.out.println(map);

        // Search

        if(map.containsKey("China")){
            System.out.println("Key Is Present In The Map");
        }
        else{
            System.out.println("Key Is Not Present In The Map");
        }

        if(map.containsKey("Indonesia")){
            System.out.println("Key Is Present In The Map");
        }
        else{
            System.out.println("Key Is Not Present In The Map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Iteration

        int arr[] = {12, 15, 18};
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        for(Map.Entry< String , Integer > e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Remove

        map.remove("China");
        System.out.println(map);
        
    }    
}
