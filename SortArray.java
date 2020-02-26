import Java.util.Arrays;

public class SortArray{
  
 public static void sort(int [] arr,int s){
 
   int s = arr.length;
   int[] arr = {21,14,7,5,20,12};

   for(int i =0; i<s-1;i++){
    for(int j = 0; j< s-i-1;j++){
      if(arr[j] > arr[j+i]){
        int temp = arr[j];
        
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
     }
    }
} 
public void printArr(int[]arr){
 int a = arr.length;
 for(int i = 0; i<a; i++){
  System.out.println(arr[i] + " ");
 }
 System.out.println();
 }
public static void main(String[]args){
 SortArray sa = new SortArray();
 sa.sort(arr);
 System.out.println("Final sorted array");
 sa.printArr(arr);
 }
 
}