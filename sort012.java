public class sort012{
public static void doSort012(int []arr){
int c0 = 0, c1= 0, c2= 0;
int [] arr2 = new int[arr.length];
for(int i = 0; i<arr.length; i++){
if(arr[i] == 0){
c0++;
}
if(arr[i] == 1){
c1++;
}
if(arr[i] == 2){
c2++;
}
}
for(int i = 0; i<c0; i++){
arr2[i] = 0;
}
for(int i = c0; i<c1 + c0; i++){
arr2[i] = 1;
}
for(int i = c1 + c0; i<c2 + c1 + c0; i++){
arr2[i] = 2;
}
for(int i = 0; i<arr2.length; i++){
System.out.println(arr2[i]);
}
}

public static void main(String args[]){
int [] arr = {1,0,0,2,2,2,1};
doSort012(arr);
}
}
