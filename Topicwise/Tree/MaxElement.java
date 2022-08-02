import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class MaxElement {
    class Pair {
        int hd;
        Node node;

        public Pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }
    /*
     * A binary tree node has key, pointer to
     * left child and a pointer to right child
     */
    

    class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    /* Inorder traversal of a binary tree */
    static int MaxElement(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(MaxElement(root.key), Math.max(MaxElement(root.left), MaxElement(root.right)));
    }

    static int MinElement(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(MinElement(root.key), Math.max(MinElement(root.left), MinElement(root.right)));
    }

    static void PrintLeafNode(Node root) {
        if (root.left == null) {
            System.out.println(root.key);
            return;
        } else {
            root = root.left;
        }
        if (root.right == null) {
            System.out.println(root.key);
            return;
        } else {
            root = root.right;
        }
    }

    static int sum = 0;

    static void SumLeafNode(Node root) {
        if (root.left == null) {
            sum += root.key;
            System.out.println(sum);
            return;
        } else {
            root = root.left;
        }
        if (root.right == null) {
            sum += root.key;
            System.out.println(sum);
            return;
        } else {
            root = root.right;
        }
    }

    // Driver code
    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print(
                "Max Element:");
        MaxElement(root);

        System.out.print(
                "Min Element:");
        MinElement(root);

        System.out.print(
                "Print leaf node Element:");
        PrintLeafNode(root);

        System.out.print(
                "sum leaf  node Element:");
        SumLeafNode(root);

        System.out.print(
                "Print node by level and enter the level:");
        PrintBylevel(root, 2);

        System.out.print(
                "Right View using BFT:");
        Right_View_using_BFT(root);

        System.out.print(
                "Right View using DFT:");
        Right_View_using_DFT(root, 1);

        System.out.print(
                "Vertical Order Iterative:");
        Vertical_Order_Iterative(root);
    }

    private static ArrayList<Integer> Vertical_Order_Iterative(MaxElement.Node root2) {

        Queue<Pair> q=new ArrayDeque<>();  // for maintaining level order

        Map <Integer, ArrayList<Integer>> all_pairs=new TreeMap<>();//  so that keys and value are sorted remain key is distance in arraylist key is there

        q.add(new Pair(0,root));

        while(!q.isEmpty()) {
    
            Pair curr=new Pair();
    
            curr=q.poll();

            if(all_pairs.containsKey(curr.hd)){
    
                all_pairs.get(curr.hd).add(curr.node.key);
 
            }
    
             else{
    
                ArrayList<Integer> list =new ArrayList<>();
    
                list.add(curr.hd,curr.node.key);
   
                all_pairs.put(curr.hd,list);

            }

            if(curr.node.left!=null){

                q.add(new Pair(curr.hd-1,curr.node.left));

            }

            if(curr.node.right!=null){
    
                q.add(new Pair(curr.hd+1,curr.node.right);

            }

        }

    }

    static int maxLevel = 0;

    private static void Right_View_using_DFT(MaxElement.Node root2, int level) {
        // DFT

        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(root.key);
            maxLevel = level;
        }
        Right_View_using_DFT(root.right, level + 1);
        Right_View_using_DFT(root.left, level + 1);
    }

    private static void Right_View_using_BFT(MaxElement.Node root2) {

        // BFT
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
                    System.out.println(node.key);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }

            }
        }

    }

    private static void PrintBylevel(MaxElement.Node root2, int Klevel) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // Step-2 Traverse Queue till it is not empty
        // 2.1 Queue poll and get the node and then look for Left and Right Child
        // 2.2 Add them in a Queue
        // and then Do Repeat the Step No -2.
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                MaxElement.Node node = queue.poll(); // First Element
                System.out.print(node.key + " , ");
                if (node.left != null && i == Klevel) {
                    queue.add(node.left);
                }
                if (node.right != null && i == Klevel) {
                    queue.add(node.right);
                }
            }
            System.out.println();

        }
        System.out.println();

    }
}


//////////////////////////////////Using Recursion vertical order
// void verticalOrderHelper(BinaryTree<Integer> root,
// int distance, TreeMap<Integer, ArrayList<Integer>> map) {
// // Termination Case
// if (root == null) {
// return;
// }

// // Stack Build
// if (map.get(distance) == null) {
// // There is no such distance present in the map
// // first time it is coming in map.
// // Create a Fresh List
// ArrayList<Integer> list = new ArrayList<>();
// list.add(root.key);
// map.put(distance, list); // Add Key as a Distance and Value as a List

// } else {
// // The key is already present in the map
// ArrayList<Integer> list = map.get(distance); // Fetch the List from that key.
// list.add(root.key);
// map.put(distance, list);
// }
// // Small Problem
// verticalOrderHelper(root.left, distance - 1, map);
// verticalOrderHelper(root.right, distance + 1, map);

// // Stack Fall
// }

// void verticalOrder(BinaryTree<Integer> root) {
// int distance = 0; // root
// TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
// verticalOrderHelper(root, distance, map);
// for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
// System.out.println(m.getKey() + " " + m.getValue());
// }
// }