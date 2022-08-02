
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Burn_A_Tree {
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
  
    }
    int result=0;
    static class DepthWrapper{
        int depth;
        DepthWrapper(int data){
             this.data = data;}
    }
   int burn(Node root,int target){
DepthWrapper dw=new DepthWrapper(-1);
//pass by ref
    }
    int Burn_On_Time(Node root,int target,DepthWrapper depthwrap)
    {
        if(root==null){
            return 0;
        }
        if (root.data==target) {
            DepthWrapper.depth=1;
            return 1;
        }
        DepthWrapper leftDepth=new DepthWrapper(-1);
        DepthWrapper RightDepth=new DepthWrapper(-1);
        int leftHeight=Burn_On_Time(root.left,target,leftDepth);
        int RightHeight=Burn_On_Time(root.left,target,RightDepth);
if(leftDepth!=null){
    result=Math.max(result,leftDepth.depth+1+leftHeight);
    depthWrapper.depth = leftDepth.depth + 1;
}
if(RightDepth!=null){
    result=Math.max(result,RightDepth.depth+1+RightHeight);
    depthWrapper.depth = RightDepth.depth + 1;
}
return Math.max(leftHeight, rightHeight) + 1;
    

    }
    void verticalOrderIterative(BinaryTree<Integer> root) {
        Queue<NodeVerticalPair> queue = new LinkedList<>();
        queue.add(new NodeVerticalPair(root, 0));
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int minDistance = 0;
        int maxDistance = 0;
        while (queue.size() != 0) {
            int size = queue.size(); // PreFetch the Queue Size
            while (size > 0) {
                // Queue Poll the Element
                NodeVerticalPair pair = queue.poll();
                // Min and Max Because of Using HashMap (Not Sorted)
                minDistance = Math.min(minDistance, pair.distance);
                maxDistance = Math.max(maxDistance, pair.distance);
                // Now Put the Node in the HashMap
                map.putIfAbsent(pair.distance, new ArrayList<>());
                // map.get(pair.distance).add(pair.node.data);
                if (pair.node.left != null) {
                    queue.add(new NodeVerticalPair(pair.node.left, pair.distance - 1));
                }
                if (pair.node.right != null) {
                    queue.add(new NodeVerticalPair(pair.node.right, pair.distance + 1));
                }
                size--;
            }
        }
        // Print in Order/ Sorted by Key
        for (int i = minDistance; i <= maxDistance; i++) {
            System.out.println(i + " " + map.get(i));
        }

    }
    public static void main(String[] args) {
        Node root = null;
        root=new Node(1);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
 
        System.out.print(
            "top view of  Element:");
            topView(root);
    }
}
