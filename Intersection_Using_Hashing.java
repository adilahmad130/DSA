import java.util.HashSet;

public class Intersection_Using_Hashing {
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection_set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j = 0; j < arr2.length; j++){
            if(set.contains(arr2[j])){
                intersection_set.add(arr2[j]);

            }
        }

        System.out.println("Intersection: " + intersection_set);

        return intersection_set.size();

    }

    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        int result = intersection(arr1,arr2);
        System.out.println("Intersection Size: " + result);
    }
}
