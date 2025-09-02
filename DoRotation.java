import java.util.ArrayList;

public class DoRotation{
    public static void Rotation(int [] arr, int k){
        int length = arr.length;
       int n = k % length;
       ArrayList<Integer> temp = new ArrayList<>();
       for(int i = length - n; i<length; i++){
        temp.add(arr[i]);
       }
       for(int i = length-1; i>=2; i--){
        arr[i]=arr[i-n];
       }
       for(int i = 0; i<n; i++){
        arr[i] = temp.get(i);
       }
      for(int i = 0; i < length; i++){
       System.out.println( arr[i]);
    }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 2;
        Rotation(arr, k);
    }
}