public class consecutive_elements {
    public static void findConsecutiveElements(int [] arr){
        int maxCnt = 1;
        int cnt = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]+ 1 == arr[j]){
                    cnt++;
            }
            }

        }
    }
    public static void main(String[] args) {
        int []arr = {102,4,100,1, 101,2,3,1,1};
        findConsecutiveElements(arr);
    }
}
