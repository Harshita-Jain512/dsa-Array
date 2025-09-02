import java.util.HashMap;

public class Sum2_brute {
    public static int[] find2sum(int [] arr, int target){
        HashMap<Integer , Integer>map  = new HashMap<>();
        int [] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0;i< arr.length; i++){
            if(map.containsKey(target-arr[i])){
               ans[0] = map.get(target - arr[i]);
               ans[1] = i;
               return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String args []){
        int [] arr = {2,6,5,8,11};
        int target = 8;
        int arr2[] = find2sum(arr, target);
        for(int i = 0; i<arr2.length; i++){
        System.out.println(arr2[i]);
        }
    }
}
