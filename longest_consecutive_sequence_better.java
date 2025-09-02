import java.util.Arrays;

public class longest_consecutive_sequence_better {
    public static void findConsecutiveElements(int [] arr){
        Arrays.sort(arr);
        int maxCount = 1;
        int count = 1; 
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i+1] == arr[i] + 1){
                count ++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
    public static void main(String[] args) {
        int []arr = {102,4,100,1, 5,101,2,3,1,1,5};
        findConsecutiveElements(arr);
    }
}
