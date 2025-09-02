public class Sum2_optimal {
    public static void find2sum(int [] arr, int target){
        int i = 0, j = 0;
        int k = target - arr[i];
        while(i < arr.length ){
            for( j = i; j< arr.length; j++){
        if(arr[j]!=k){
            j++;
        }
    }
        if(k == arr[j]){
            System.out.println(i +"," + j);
        }
        i++;
    }
    }
    public static void main(String args []){
        int [] arr = {2,6,5,8,11};
        int target = 14;
        find2sum(arr, target);
    }
}
