public class Longest_Consecutive_sequence_brute{
    public static void findLongestSequence(int [] arr){
        int  maxCount = 1;
        for(int i = 0; i< arr.length; i++){
            int count = 1;
            int x = arr[i];
             while(LinearSearch(arr, x + 1)){
                count ++;
                x++;
             }
             maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);

    }
    public static boolean LinearSearch(int []arr, int num){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num)
                return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int []arr = {100, 200, 1,3,2,4};
        findLongestSequence(arr);
    }
}