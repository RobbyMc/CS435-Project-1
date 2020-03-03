
public class AVLTree
{

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
           
          }
        
   public void deleteIter(Node root, int val){
           
      Node parentNode = null, current = root;
      boolean hasLeft = false;
    
       if(root == null){
         return root;
         }
     
      while(current != null){
         if((int)current.data == val){
           break;
        }
      
        parentNode = current;
      
      if(val < (int)current.data){
        hasLeft = true;
        current = current.leftchild;
        }else{
         hasLeft = false;
         current = current.rightchild;
        }
       }
       return root;
       
      }
      
      public static findNextIter(Node n, int key){
        while(n !=null){
         if(key> n.data){
         n = n.righttchild;
         return n;
        }
        else if(key<n.data){
         n = n.leftchild;
         }
         else
            return true;
       }
       return false;
     
     
      }
      
      public void findMinIter(Node n){
         Node current = n;
         while(current.leftchild !=null){
         current = current.leftchild;
         }
         return (current.data);
         }
         
         
     public int findMaxIter(Node n){
        Node current = n;
        while(current.rightchild !=null){
          current = current.rightchild;
          }
          return(current.data);
         }

     public static void main(String[]args){
       
        AVLTree tree = new AVLTree();
        tree.root = tree.insertIter(tree.root,23);
        tree.root = tree.insertIter(root,20);
        tree.root = tree.insertIter(root,19);
        tree.root = tree.insertIter(root,24); 
        System.out.println("Max value is: "+ findMaxIter(root));
         
               
        }

     
             



}