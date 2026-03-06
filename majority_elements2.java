import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority_elements2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res = new ArrayList<>();
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3){
                res.add(key);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        majority_elements2 obj = new majority_elements2();
        int [] arr = {3,2,3};
        System.out.println(obj.majorityElement(arr));
    }
}
