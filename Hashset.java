import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        //Insert

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size

        System.out.println("Size of Set is: " + set.size());

        System.out.println("Set: " + set);

        //Search - contains

        if(set.contains(1)){
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does Not Contain");
        }

        //Delete

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does Not Contain 1 - We Deleted 1");
        }

        //Iterator

        set.add(1);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //Checking if Set is Empty
        if(!set.isEmpty()){
            System.out.println("Set is Not Empty");
        }
    }
}
