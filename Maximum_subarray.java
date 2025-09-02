public class Maximum_subarray {
    public static void findMaxSubarray(int []arr){
        int maxsum = 0;
        for(int i = 0;i<arr.length; i++){
            int sum = arr[i];
            for(int j = i+1; j<arr.length; j++){
                sum = sum + arr[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int [] arr = {2,2,-1};
        findMaxSubarray(arr);
    }
}
