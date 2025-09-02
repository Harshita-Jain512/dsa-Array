public class BinarySearch {
    public static void doBinarySearch(int []arr, int ele){
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low + high)/2;
        if(arr[mid] == ele){
            System.out.println(mid);
            break;
        }else if(ele>mid){
            low = mid + 1;
        }else {
            high = mid - 1;
        }
    }
        

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int ele = 3;
        doBinarySearch(arr, ele);
    }
}
