import java.util.ArrayList;

public class leaders_in_array {
    public static void findLeaders(int [] arr){
        ArrayList <Integer> ans = new ArrayList<>();
        for (int i = 0 ;i <arr.length; i++) {
            boolean check = true;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    check = false;
                    break;    // for arr[3] - it will not print because of 6 , the inner for loop ......
                }
                    
                }
                if(check == true){
                    ans.add(arr[i]);
                }
            }
            System.out.println(ans);
            
        }
    public static void main(String[] args) {
        int []arr = {10,22,12,3,0,6};
        findLeaders(arr);
    }
}
