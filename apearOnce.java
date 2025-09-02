import java.util.HashMap;

public class apearOnce {
    public static void findApearOnce(int [] arr){
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
             for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4};
        findApearOnce(arr);
    }
}
