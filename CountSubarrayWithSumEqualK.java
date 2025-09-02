public class CountSubarrayWithSumEqualK {
    public static void countSubarray(int []arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
           int  sum = arr[i];
           for(int j = i+1; j<arr.length;j++){
               sum = sum + arr[j];
               if(sum == k){
                count++;
               }
           }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        int k = 6;
        countSubarray(arr, k);
    }
}
