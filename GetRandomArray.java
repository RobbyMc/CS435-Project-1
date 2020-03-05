import java.util.Arrays;
import java.util.Random;
public class RandArray extends BinarySearchTree{

class Node{
    Node leftchild,rightchild;
    int data;
    public Node(int data){
    this.data = data;
    this.leftchild= null;
    this.rightchild = null;
    }
  };
     public void insert(int key){
      root = insertRec(root,key);
      }

 Node getRandomArray(int []nums){
      BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();
      nums = new int[10000];
      for(int i: nums) {
        tree.insert(i);
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
     Random rd = new Random();
     BinarySearchTreeRecursive bstrec = new BinarySearchTreeRecursive();
     
     int n = rd.nextInt(10000);
     bstrec.getRandomArray(n);
    
     System.out.println("Preorder traversal");
     bstrec.preOrder(root);
     }
 
    