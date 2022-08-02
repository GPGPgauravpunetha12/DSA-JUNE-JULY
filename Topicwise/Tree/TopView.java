import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
public class TopView {
  
    static ArrayList<Integer> topView(Node root)
    {
        int poper;
             ArrayList<Integer> FinalList = new ArrayList<>();
         ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
    q.add(root.data);
        Node temp=null;
        temp=root;
        while(q.size() != 0){
        if(temp.left==null){
          temp= root.right;
     }
        else{
            temp=temp.left;
            q.add(temp.data);
            
        }  
        poper= q.poll();
       list.add(poper);
            
        }
          if(temp.right!=null){
    
            list.add(temp.data);
            // list.forEach(echno->q.add(echno));
         
           temp=temp.right;
        }
        
       
   FinalList.addAll(list);
    
        
        return FinalList;
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
