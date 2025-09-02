public class consecutive{
    public static void FindMaximumConsecutive(int []arr){
        int count = 0;
            int maxCount = 0;
         for(int i = 0;i< arr.length; i++){
                if(arr[i] == 1){
                    count++;
                    maxCount = Math.max(count, maxCount);
                }else{
                    count = 0;
                }
            }
            System.out.println(maxCount);
        
                
            }
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,0,1,1};
        FindMaximumConsecutive(arr);
    }
}