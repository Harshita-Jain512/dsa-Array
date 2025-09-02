public class apearOnce2 {
    public static void findApearOnce(int [] arr){
        int xor = 0;
        for(int i = 0;i<arr.length; i++){
            xor = xor^arr[i];
        }
         System.out.println(xor);
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,3,3,4,4};
        findApearOnce(arr);
    }
}
