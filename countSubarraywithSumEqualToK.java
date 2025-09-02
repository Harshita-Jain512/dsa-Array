public class countSubarraywithSumEqualToK {
    public static void countSubarray(int [] arr, int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while(left<=right){
        if(sum == k){
            count++;
        }
        if(sum>k){
            sum = sum -arr[left];
            left++;
        }
        if(right<arr.length){
         sum = sum + arr[right];
            right++;
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
