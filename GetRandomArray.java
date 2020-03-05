public class RandArray{

class Node{
    Node leftchild,rightchild;
    int data;
    public Node(int data){
    this.data = data;
    this.leftchild= null;
    this.rightchild = null;
    }
  };
  
 Node getRandomArray(int []arr,int first, int last){
   if(first > last){
      return null;
      }
      
   int mid = (first + last)/2;
   
   Node node = new Node(arr[mid]);
   node.leftchild = getRandomArray(arr, first, last);
   
   node.rightchild = getRandomArray(arr, mid + 1, last);
   
   return node;
   
   }
   
  void preOrder(Node n){
     if( n == null){
        return;
       
      }
      
      System.out.println(n.data+ " ");
      preOrder(node.leftchild);
      preOrder(node.rightchild);
      
       }
       
   
   
   public static void main(String[]args){
     BinarySearchTreeRecursive bstrec = new BinarySearchTreeRecursive();
     int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
     int n = arr.length;
     root = bstrec.getRandomArray(arr, 0, n -1);
     System.out.println("Preorder traversal");
     bstrec.preOrder(root);
     }
 
    