import java.util.*;
public class CountSubarrayWithXorKOptimal {

     public static int giveCounting(int []arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int xor = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
            int x = xor ^ k;
            if(map.containsKey(x)){
                count = count + map.get(x);
            }
            else{
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }
        }
        return count;
     }
    public static void main(String[] args) {
        int []arr = {5, 6, 7, 8, 9};
        int k = 5;
        System.out.println(giveCounting(arr, k));
    }
}
