public class LongestSubarrayWithSum {
    public static void findLongestSubarray(int []arr, int k ){
        int  maxLength = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                int sum = 0;
                for (int z = i; z<=j; z++){
                  sum = sum + arr[z];
            }
            if(sum == k){
                    maxLength = Math.max(maxLength,j-i+1);
                }
        }
    }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        findLongestSubarray(arr, k);
    }
}
