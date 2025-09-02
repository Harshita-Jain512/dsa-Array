import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void doUnion(int [] arr, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< arr.length; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i< arr2.length; i++){
            set.add(arr2[i]);
        }
       System.out.println(set);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] arr2 = {4,5,6,7};
        doUnion(arr, arr2);
    }
}
