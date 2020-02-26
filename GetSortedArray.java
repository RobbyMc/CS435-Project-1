import Java.util.Arrays;

int [] arr = {12,4,13,5,6,20};
public class ArraySorting{

static void insertionSort(int[] arr, int size){

  int i, key, j;
  for(i = 1; i<size; i++){
    key = arr[i];
    j--1;
    
    while(j>= 0 && arr[j] > key){
      arr[j+1] = arr[j];
      j--;
     }
     
     arr[j+1] = key;
    }
    
  }
  public static void printArray(int[]arr, int k){
    for(int i = 0; i< k;i++){
     System.out.println(arr[i]+ " ");
    
  }
  
  public void getSortedArray(int[]n){
   int size = arr.length;
    insertionSort(n, size);
    }
   
   public static void main(String[]args){
    int h = 20;
    int k = arr.length;
    getSortedArray(arr);
    System.out.println("Sorted Array"):
    printArray(arr,k);
   }
 }