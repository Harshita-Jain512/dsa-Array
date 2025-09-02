import java.util.HashMap;

public class Missing2 {
    public static int findMissing(int [] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length; i++){
            if(arr[i] == i+1){
                map.put(i+1, 1);
            }else{
                map.put(i+1,0);
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        System.out.println( findMissing(arr));
    }
}
