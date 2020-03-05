import java.util.Random;

public class GetRandArray extends AVLTree{
  
  
  class Node{
    int data;
    Node parent;
    Node leftchild;
    Node rightchild;
  
  public Node(int data){
     this.leftchild = null;
     this.rightchild = null;
     this.data = data;
   }
   Node root;
   public AVLTree(){
     root = null;
     int height(Node N) { 
       if (N == null) 
         return 0; 
  
        return N.height; 
    } 
  
   }
    Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 
  
        // Perform rotation 
        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(height(x.leftchild), height(x.rightchild)) + 1; 
        y.height = max(height(y.leftchild), height(y.rightchild)) + 1; 
  
        // Return new root 
        return y; 
    } 
    
     public int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
    } 
    

  
    Node rightRotate(Node y) { 
        Node x = y.leftchild; 
        Node T2 = x.rightchild; 
  
        // Perform rotation 
        x.rightchild = y; 
        y.leftchild = T2; 
  
        // Update heights 
        y.height = max(height(y.leftchild), height(y.rightchild)) + 1; 
        x.height = max(height(x.leftchild), height(x.rightchild)) + 1; 
  
        // Return new root 
        return x; 
    } 
  


   public void insertIter(Node n, int value){ //inserts Nodes iteratively
     Node current, parentNode;               // create new nodes current and parentNode
     Node temp = new Node(value);            //create new Nodes temp and assign it to 

      if(n == null){
       n = temp;
       return n;
       }else{
         current = n;
         }
       }  
     while(true){
      parentNode = current.leftchild;
      
      if(value <(int)current.data){
        current = current.leftchild;
        if(current == null){
         parentNode.leftchild = temp;
         return n;
         }
         
         }else if(value >(int) current.data){
           current = current.rightchild;
           
           if(current == null){
             parentNode.rightchild = temp;
             return rt;
            }
           }
           int balance = getBalance(node); 
  
        // If this node becomes unbalanced, then there 
        // are 4 cases Left Left Case 
        if (balance > 1 && value < node.leftchild.value) 
            return rightRotate(node); 
  
        // Right Right Case 
        if (balance < -1 && key > node.rightchild.value) 
            return leftRotate(node); 
  
        // Left Right Case 
        if (balance > 1 && key > node.leftchild.key) { 
            node.leftchild = leftRotate(node.leftchild); 
            return rightRotate(node); 
         }

          }
          
     Node getRandomArray(int []nums){
      AVLTree tree = new AVLTree();
      nums = new int[10000];
      for(int i: nums) {
        tree.insertIter(i);
      }
      
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
     AVLTree tree = new AVLTree();
     
     int n = rd.nextInt(10000);
     tree.getRandomArray(n);
    
     System.out.println("Preorder traversal");
     bstrec.preOrder(root);
     }
}

     
  
