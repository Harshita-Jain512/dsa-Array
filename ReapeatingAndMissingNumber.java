import java.util.Arrays;

public class ReapeatingAndMissingNumber {
    public static int[] find(int []arr){
        int []result = new int[2];
        for(int i = 1; i <= arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                result[0] = i;
            }else if(count == 0){
                result[1] = i;
            }
            if(result[0] != 0 && result[1] != 0){
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int []arr = {3, 5, 4, 1, 1};
        int []result = find(arr);
        System.out.println("Repeating number is: " + result[0]);
        System.out.println("Missing number is: " + result[1]);
    }
}
