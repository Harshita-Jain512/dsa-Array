import java.util.ArrayList;

public class rearrange_array_element_by_sign {
    public static void do_rearrange(int []arr){
        ArrayList <Integer>arr1 = new ArrayList<>();
            ArrayList <Integer>arr2 = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<0){
                arr1.add(arr[i]);
            }else{
                arr2.add(arr[i]);
            }
        }
for (int i = 0; i < arr.length/2; i++) {
    if(arr[0] > 0){
       arr[2 * i] = arr2.get(i);
       arr[(2 * i) + 1] = arr1.get(i);

    }else{
        arr[2 * i] = arr1.get(i);
       arr[(2 * i) + 1] = arr2.get(i);
    }
}
for(int i = 0; i<arr.length; i++){
System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int [] arr = {-1,-3,2,4};
        do_rearrange(arr);
    }
}
