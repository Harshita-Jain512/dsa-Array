import java.util.HashMap;
import java.util.Map;

public class majorityElements {
    public static void findMajorityElement(int [] arr){
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                System.out.println("Majority element is: " + entry.getKey());
                return;
            }
        }
        //System.out.println(map);
    }
    public static void main(String[] args) {
        int [] arr = {2,2,3};
        findMajorityElement(arr);
    }
}
