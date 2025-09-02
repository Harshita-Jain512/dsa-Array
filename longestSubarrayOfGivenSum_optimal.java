public class longestSubarrayOfGivenSum_optimal {
    public static void findLongestSubarray(int [] arr, int k){
        int left = 0, right = 0;
        int sum = arr[0];
        int maxLength = 0;
        while(right<arr.length){
        while(left<=right && sum>k){
            sum = sum - arr[left];
                left++;
        }
        if(sum == k){
                maxLength = Math.max(maxLength, right-left + 1);
            }
             right++;
             if(right < arr.length){
            sum = sum + arr[right];
        }
    }
            System.out.println(maxLength);
        }
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,1,4,2,3};
        int k = 3;
        findLongestSubarray(arr, k);
    }
}
