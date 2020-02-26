public class BinarySearchTreeIterative{

 class Node{
   int data;
   Node parent,leftchild,rightchild;
   public Node(int data){
    this.data = data;
    leftchild = null;
    rightchild = null;
    }
  };
  Node root;
  public BinarySearchTreeIterative(){
     root = null;
  }
  
  public void insertIter(Node * rt, int key){
    Node current,parentNode;
    Node temp = new Node(key);
      if( rt = null){
      rt = temp;
       return rt;
       }else{
        current = rt;
     }
     
    while(true){
      parentNode = current.leftchild;
      
      if(key <(int)current.data){
        current = current.leftchild;
        if(current == null){
         parentNode.leftchild = temp;
         return rt;
         }
         
         }else if(value >(int) current.data){
           current = current.rightchild;
           
           if(current == null){
             parentNode.rightchild = temp;
             return rt;
            }
           }
           
          }
          
         }
   public static deleteIter(Node root,int val){
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
       if(key>n.data){
         n = n.righttchild;
        }
        else if(key<n.data){
         n = n.leftchild;
         }
         else
            return true;
       }
       return false;
     
     
      }
      
      
     public static findPrevIter(Node root, int key){
      while(root !=null){
        if(key < key.data){
          root = root.leftchild;
        }else if(key>data){
          root= root.rightchild;
          }else{
             return true;
            }
            return false;
          }
         }
         
     
     
       }
       
     public int findMinIter(Node n){
         Node current = n;
         while(current.leftchild !=null){
         current = current.leftchild;
         }
         return (current.data);
         }
         
         
     public int findMaxIter(Node n){
        Node current = n;
        while(current.rightchild !=null){
          current = current->rightchild;
          }
          return(current.data);
         }
       
     public static void main(String[]args){
       node root = null;
       root = insertIter(root,23);
       insert(root,22);
       insert(root,25)
       insert(root,20);
       insert(root,16);
       
       System.out.println("Max value is: " +findMaxIter(root));
     
      }
      
   }
      
     
    