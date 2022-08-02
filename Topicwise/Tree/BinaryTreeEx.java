import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class BinaryTree<T> {
    T data;
    BinaryTree<T> left; // Left Child Reference
    BinaryTree<T> right; // right child Reference

    BinaryTree(T data) {
        this.data = data;
        // default left and right are null (Java)
    }
}

class BinaryTreeOperations {
    String msg = "root";
    Scanner scanner = new Scanner(System.in);
    int parent = -1;

    BinaryTree<Integer> insert() {
        System.out.println("Enter the Data for " + msg + " Node and Parent is " + parent + " For Exit Write -1 ");
        int data = scanner.nextInt();
        // Termination case
        if (data == -1) {
            return null;
        }
        // Create a Parent Node / root node
        BinaryTree<Integer> node = new BinaryTree<>(data);
        parent = data;
        msg = "left";
        node.left = insert();
        msg = "right";
        parent = data;
        node.right = insert();
        parent = data;
        msg = "root";
        return node; // return root node

    }

    void print(BinaryTree<Integer> currentNode) {
        // Termination Case
        if (currentNode == null) {
            return;
        }
        String output = "";
        output += currentNode.data + " => ";
        if (currentNode.left != null) {
            output += "Left : " + currentNode.left.data + " , ";
        }
        if (currentNode.right != null) {
            output += "Right : " + currentNode.right.data + " , ";
        }
        System.out.println(output);
        print(currentNode.left);
        print(currentNode.right);

    }

    void preOrder(BinaryTree<Integer> root) {
        // Termination Case
        if (root == null) {
            return;
        }
        // Parent, Left and then Right
        System.out.println(root.data); // Parent Print
        preOrder(root.left); // Small Problem
        preOrder(root.right); // call when stack fall
    }

    void preOrderIterativeSolution(BinaryTree<Integer> root) {
        // Step-0 If root is empty
        if (root == null) {
            return;
        }
        // Step-1 Start with a Stack and push the first node in a Stack
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        stack.push(root);
        // Step-2 Keep Pop the Element till stack is not empty
        // Pop and Print it.
        // Put the right child first in a stack and then put the left child in a stack
        // the benefit is left is on top .
        // Ensure left is not null and right is not null
        // Step-3 Keep Repeat
        while (!stack.isEmpty()) {
            BinaryTree<Integer> node = stack.pop();
            System.out.println(node.data);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    void inOrder(BinaryTree<Integer> root) {
        // Termination Case
        if (root == null) {
            return;
        }
        // Left, Parent and then Right
        inOrder(root.left); // Small Problem
        System.out.println(root.data); // Parent Print

        inOrder(root.right); // call when stack fall
    }

    void inOrderIterative(BinaryTree<Integer> root) {
        // Step-1 Need Stack
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        BinaryTree<Integer> temp = null;
        temp = root;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            System.out.println(temp.data);
            temp = temp.right;

        }
    }

    void postOrder(BinaryTree<Integer> root) {
        // Termination Case
        if (root == null) {
            return;
        }
        // Left, Right and then Parent
        postOrder(root.left); // Small Problem
        postOrder(root.right); // call when stack fall
        System.out.println(root.data); // Parent Print

    }
    void PostOrderIterative(BinaryTree<Integer> root) {
        // Step-1 Need Stack
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        BinaryTree<Integer> temp = null;
        temp = root;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            System.out.println(temp.data);
            temp = temp.right;
         
        //to b done see once more  for logic

        }
    }

    void levelOrder(BinaryTree<Integer> root) {
        // Root Node Goes in a Queue
        // Step-1 Create a Queue
        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        // Step-2 Traverse Queue till it is not empty
        // 2.1 Queue poll and get the node and then look for Left and Right Child
        // 2.2 Add them in a Queue
        // and then Do Repeat the Step No -2.
        while (!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.poll(); // First Element
            System.out.print(node.data + " , ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }

    void levelOrder2(BinaryTree<Integer> root) {
        // Root Node Goes in a Queue
        // Step-1 Create a Queue
        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        // Step-2 Traverse Queue till it is not empty
        // 2.1 Queue poll and get the node and then look for Left and Right Child
        // 2.2 Add them in a Queue
        // and then Do Repeat the Step No -2.
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                BinaryTree<Integer> node = queue.poll(); // First Element
                System.out.print(node.data + " , ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();

        }
        System.out.println();
    }

    int height(BinaryTree<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    int heightIterative(BinaryTree<Integer> root) {
      
        if (root == null) {
            return 0;
        }
        Stack<BinaryTree<Integer>> stack = new Stack<>();
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
    int countNodes(BinaryTree<Integer> root) {
        // If No node (reach to null so treat it as 0 count)
        if (root == null) {
            return 0;
        }
        int counter = 1;
        counter = counter + countNodes(root.left);
        counter = counter + countNodes(root.right);
        return counter;
    }

    // DFT
    int maxLevel = 0;

    void printLeftView(BinaryTree<Integer> root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);
    }

    // BFT
    void printLeftView2(BinaryTree<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                BinaryTree<Integer> node = queue.poll();
                if (i == 0) {
                    System.out.println(node.data);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

    }
void digonalView(BinaryTree<Integer> root){
    Queue<BinaryTree<Integer>> queue = new LinkedList<>();
    queue.add(root);
    while(queue.size()!=0){
        int size=queue.size();
        while(size>0){
            BinaryTree<Integer> node =queue.poll();
            while(node!= null){
                if(node.left != null){
                queue.add(node.left);
            }
            System.out.println(node.data);
            node=node.right;
        }
    size--;}
    }
}
    void verticalOrderHelper(BinaryTree<Integer> root,
            int distance, TreeMap<Integer, ArrayList<Integer>> map) {
        // Termination Case
        if (root == null) {
            return;
        }

        // Stack Build
        if (map.get(distance) == null) {
            // There is no such distance present in the map
            // first time it is coming in map.
            // Create a Fresh List
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance, list); // Add Key as a Distance and Value as a List

        } else {
            // The key is already present in the map
            ArrayList<Integer> list = map.get(distance); // Fetch the List from that key.
            list.add(root.data);
            map.put(distance, list);
        }
        // Small Problem
        verticalOrderHelper(root.left, distance - 1, map);
        verticalOrderHelper(root.right, distance + 1, map);

        // Stack Fall
    }

    void verticalOrder(BinaryTree<Integer> root) {
        int distance = 0; // root
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        verticalOrderHelper(root, distance, map);
        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
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
                map.get(pair.distance).add(pair.node.data);
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
   
}

public class BinaryTreeEx {
    public static void main(String[] args) {
        BinaryTreeOperations opr = new BinaryTreeOperations();
        BinaryTree<Integer> root = opr.insert();
        // opr.print(root);1
    // opr.inOrderIterative(root);1
  opr.heightIterative(root);
  System.out.println("height of tree     ");
    System.out.println(opr.heightIterative(root));
        // opr.levelOrder2(root);
        // opr.printLeftView(root, 1);
        // opr.verticalOrder(root);

    }
}
