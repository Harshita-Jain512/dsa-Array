import java.util.*;
public class MergeOverlappingSubinterval {
    public static List<List<Integer>> merge(int [][]arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        for(int i  = 0; i < arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && end <= ans.get(ans.size() - 1). get(1)){
                continue;
            }
            for( int j = i + 1; j < arr.length; j++){
                if(arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;

    }
    public static void main(String[] args) {
        int [][]arr = {{1,3},{2,6},{8,10},{15,18}};
         System.out.println(merge(arr));
    }
}
