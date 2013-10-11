package CrackingCodeLibrary;
/** a binary tree, the data element is 
generic type**/


public class TreeNode<T extends Comparable<T>> {
  public T data;
  public TreeNode<T> left;
  public TreeNode<T> right;
  public TreeNode<T> parent;
  private int size=0;
 
public T max(T data1, T data2)
{
  if (data1.compareTo(data2)>0)
      return data1;
  else
      return data2;
}

 public TreeNode(T d){
     data = d;
     size =1;
 }

 public void setLeftChild(TreeNode<T> left){
    this.left=left;
    if(left!=null){
         left.parent = this;
    }
 
 }

 public void setRightChild(TreeNode<T> right){
    this.right=right;
    if(right!=null){
        right.parent=this;
   }
 }

public void insertInOrder(T data){
   if(data.compareTo(data)<=0){
         if(this.left==null){
           setLeftChild(new TreeNode(data));
          } else{
            this.left.insertInOrder(data);
          }
         
    }
   else {
         if(this.right==null){
          setRightChild(new TreeNode(data));
         } else {
           this.right.insertInOrder(data);
         }  
   }

  
 }

public int size(){
    return size;
}

public boolean isBST(){

    if(left!=null){
        if(this.data.compareTo(left.data)<0||left.isBST()==false)
             return false;
    }
    if(right!=null){
      if(this.data.compareTo(right.data)>0||right.isBST()==false){
         return false;
     }
   
   }
 return true;
}

public int height(){
    int leftHeight= (left!=null?left.height():0);
    int rightHeight=( right!=null?right.height():0);
    return 1+ Math.max(leftHeight,rightHeight);
}

public TreeNode<T> find(T d){
     if(d.compareTo(data)==0)
          return this;
     else if(d.compareTo(data)<0){
           return (left!=null? left.find(d):null);
        }
     else if(d.compareTo(data)>0){
           return (right!=null?right.find(d):null);
     }
       return null;
     }

public TreeNode<T> createMinimalBST(T arr[], int start, int end){
                if (end < start) {
                        return null;
                }
                int mid = (start + end) / 2;
                TreeNode<T> n = new TreeNode<T>(arr[mid]);
                n.setLeftChild(createMinimalBST(arr, start, mid - 1));
                n.setRightChild(createMinimalBST(arr, mid + 1, end));
                return n;
        }
       
public  TreeNode<T> createMinimalBST(T array[]) {
                return createMinimalBST(array, 0, array.length - 1);
        }
}
