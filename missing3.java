public class missing3 {
    public static int findMissing(int []arr){
        int xor = 0;
        int xor2 = 0;
        for(int i = 1;i<=arr.length+1;i++){
             xor = xor ^ i;
        }
       for(int j = 0; j<arr.length; j++){
        xor2 = xor2 ^ arr[j];
       }
       return xor ^ xor2;
    }
    public static void main(String[] args) {
        int []arr = {1,2,4};
        findMissing(arr);
        System.out.println( findMissing(arr));
    }
}
