import java.util.*;
public class countInversionOptimal {
    public static int countInversions(int []arr, int n){
        return mergeSort(arr, 0, n - 1);
    }
    public static int mergeSort(int []arr, int low, int high){
        int count = 0;
        if(low >= high){
            return 0;
        }
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public static int merge(int []arr, int low, int mid, int high){
        int count = 0;
        int []temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                count = count + (mid - i + 1);
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for(i = low; i <= high; i++){ // check this also + why use count in merge sort!
            arr[i] = temp[i - low];
        }
        return count;
    }
public static void main(String[] args){
    int []arr = {5, 3, 2, 1, 4};
    int n = arr.length;
    System.out.println(countInversions(arr, n));
}
}