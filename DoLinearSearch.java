public class DoLinearSearch {
    public static void linearSearch(int [] arr, int ele){
        for(int i = 0;i<arr.length; i++){
            if(arr[i] == ele){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {2,4,6,8,7,5,4};
        int ele = 8;
        linearSearch(arr,ele);
    }
}
