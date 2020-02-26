import Java.util.Scanner;


public class BinarySearchTreeRecursive{
  
   class Node{  //Class containing data integer, left and right child nodes,
               // parent nodes
    int data;
    Node parent;
    Node leftchild;
    Node rightchild;
    public Node(int data){
      this.data = data;
      leftchild = null;
      rightchild = null;
 }
 }  
   Node root;// root node declared
  public BinarySearchTreeRecursive(){
   this.root = null;
  }
  Node insertRec(Node n,int k){
     if(k < n.k){
        if(n.leftchild !=null){
         insertRec(n.leftchild , k);// checks if  leftchild has a value or not 
        }                          // 
        else
        {
          n.leftchild = new Node(k);
        }
       }
        else if(k>n.k)
        {
         if(n.rightchild !=null)//checks to see if rightchild has a value or not
         {                     // and recursively calls method if not
          insertRec(n.rightchild,k);
         }
         else
            {
            n.rightchild = new Node(k); 
            }
           
         }
         
       }
   public void insert(int key){
     root = insertRec(root,key);
   }
   public static deleteRec(Node node, int value){ // deletes node from 
                                                //binary search tree
      if(node == null){
         return node;
        }      
      
      if(value < (int)root.data){
        root.leftchild = deleteRec(root.leftchild, value);
       }
      else if (value < (int)root.data){
        root.rightchild = deleteRec(root.rightchild,value);
       }
    }
   
   private boolean findNextRec(Node current, int value){
       if (current == null){ // checks if current is null
         return false;       // returns false if it is
       }
       else if(value == current.value){//
         return true;        
       }
       return value < current.value
         ?findNextRec(current.leftchild, value)
         : findNextRec(current.rightchild,value);
     }
    private boolean findPrevRec(int i, Node nd){
     if(nd == null){
      return false;
     return nd.data == i || find(i,nd.next);
     }
    private boolean findPrevRec(int i){
          return findPrevRec(i, parent);
         }
    public static findMinRec(Node t ){
       if(t == null){
         return Integer.MAX_VALUE;
       }
       int data = t.data;
       int leftchild = findMinRec(t.leftchild);
       int rightchild = findMinRec(t.rightchild);
       return Math.min(data, Math.min(left, right));
        
    }
    public static findMaxRec(Node t){
     if(null == t){
      return Integer.MIN_VALUE;
      }
      int currentNode = t.data;
      int hleftsub=findMaxRec(t.leftchild);
      int hrightsub = findMaxRec(t.rightchild);
      return Math.max(Math.max(hleftsub,hrightsub),currentNode);
      }
    void inOrderRec(Node rt){
      if(rt != null){
        inOrderRec(rt.leftchild);
        System.out.println(rt.data);
        inOrderRec(rt.rightchild);
        }
      }
     void inOrder(){
       inOrder(root);
      }
    public static void main(String[]args){
      
      BinarySearchTreeRecursive bstrec = new BinarySearchTreeRecursive();
       bstrec.insert(25);
       bstrec.insert(20);
       bstrec.insert(19);
       bstrec.insert(12);
       bstrec.insert(13);
       bstrec.deleteRec(13);
       bstrec.deleteRec(25);
       bstrec.inOrder();
       
}  
