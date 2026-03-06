import java.util.*;
public class longestSumWithSum0 {
    public static int findLongestSubarray(int arr[], int n){
        int max = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            if(sum  == 0){
                max =  i + 1;
            }
             if(map.containsKey(sum)){
                int prev = i - map.get(sum);
                max = Math.max(max, prev);
             }else{
                map.put(sum, i);
             }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] = {6, -2, 2, -8, 1, 7, 4, -10} ;
        int n = arr.length;
        System.out.println(findLongestSubarray(arr, n));
    }
}