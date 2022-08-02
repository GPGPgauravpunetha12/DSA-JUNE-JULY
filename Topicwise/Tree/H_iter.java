import java.util.Stack;

/* A binary tree node has key, pointer to
    left child and a pointer to right child */
    class BinaryTree<T> {
        T data;
        BinaryTree<T> left; // Left Child Reference
        BinaryTree<T> right; // right child Reference
    
        BinaryTree(T data) {
            this.data = data;
            // default left and right are null (Java)
        }
    }
   
   
    public class H_iter {
        
    static BinaryTree<Integer> root;
  

    static int heightIterative(BinaryTree<Integer> root) {
      // to be done correct
        if (root == null) {
            return 0;
        }
        Stack<BinaryTree> stack = new Stack<>();
        BinaryTree<Integer> temp = null;

        temp = root;
        int maxLeft=0;
        int maxRight=0;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
              
            }
           maxLeft = stack.size();
            while(!stack.isEmpty()){
                temp = stack.pop();
            }
         
            while (temp != null) {
                stack.push(temp);
                temp = temp.right;
               
            }
             maxRight = stack.size();
            while(!stack.isEmpty()){
                temp = stack.pop();
            }
         
        
    }
    return 1 + Math.max(maxLeft, maxRight);
}





public static void main(String[] args) {
        
        root = new BinaryTree<Integer>(10);
        root.left = new BinaryTree<Integer>(11);
        root.left.left = new BinaryTree<Integer>(7);
        root.right =new BinaryTree<Integer>(9);
        root.right.left = new BinaryTree<Integer>(15);
        root.right.right = new BinaryTree<Integer>(8);
        System.out.print(   "height using iterative approch   ");
            heightIterative(root);
    }

}
