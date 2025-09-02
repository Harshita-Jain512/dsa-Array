public class missing {
    public static void findMissing(int [] arr){
        for(int i = 1; i<=arr.length; i++){
            int flag = 0;
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
                if(flag == 0){
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {
        int [] arr =  {1,2,3,5};
        findMissing(arr);
    }
}
