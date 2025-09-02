public class majorityElement_optimal {
    public static void findMajorityElement(int [] arr){
        int cnt = 0;
         int el = 0;
         for(int i = 0; i< arr.length; i++){
            if(cnt == 0){
            cnt=1;
            el = arr[i];
         }
         else if(arr[i] == el){
                cnt++;
         }else{
            cnt--;
         }
    }
    int cnt1 = 0;
    for(int i = 0; i< arr.length; i++){
        if(arr[i] == el){
            cnt1++;
        }
    }
        if(cnt1> arr.length/2){
            System.out.println(el);
        }else{
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,2,3};
        findMajorityElement(arr);
    }
}
