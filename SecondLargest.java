public class SecondLargest {
    public static void findSecondLargest(int [] arr){
        if (arr.length < 2) {
            System.out.println("-1"); // Not enough elements
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++){
        if(arr[i]>largest){
             secondLargest = largest;
            largest = arr[i];
        }
       }
       System.out.println(secondLargest);
}

    public static void main(String[] args) {
        int [] arr = {1,8,5,6,3,5,9};
        findSecondLargest(arr);
    }
}
