public class Maximum_subarray_optimal {
    public static void findMaxSubarray(int []arr){
        int maxsum = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            maxsum = Math.max(maxsum, sum);
            if(sum < 0){
                sum = 0;
            }
            
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(arr);
    }
}
