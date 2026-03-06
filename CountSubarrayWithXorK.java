public class CountSubarrayWithXorK {
    public static int giveCounting(int []arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){
                int xor = 0;
                for(int z = i; z<=j; z++){
                     xor ^= arr[z];
                }
                if(xor == k){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr = {5, 6, 7, 8, 9};
        int k = 5;
        System.out.println(giveCounting(arr, k));
    }
}
