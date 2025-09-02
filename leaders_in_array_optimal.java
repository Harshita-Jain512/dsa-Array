import java.util.ArrayList;

public class leaders_in_array_optimal {
    public static void findLeaders(int [] arr){
        int maxNum = Integer.MIN_VALUE;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = arr.length -1; i>=0; i--){
            if(arr[i]>maxNum){
             ans.add(arr[i]);
             maxNum = Math.max(maxNum, arr[i]);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int []arr = {10,22,12,3,0,6};
        findLeaders(arr);
    }
}