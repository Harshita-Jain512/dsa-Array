public class sort012_optimal {
    public static void doSort012(int [] arr){
        int low  = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid<high){
            if(arr[mid] == 0){
                swap(mid, low, arr);
                mid++;
                low++;
            }
            if(arr[mid] == 1){
                mid++;
            }
            if(arr[mid] == 2){
                swap(mid, high, arr);
                 high--;
            }

        }
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap( int i, int j, int [] arr){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
int [] arr = {1,0,0,2,2,2,1};
doSort012(arr);
}
}

