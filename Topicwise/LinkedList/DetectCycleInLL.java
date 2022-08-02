import java.util.Scanner;

class Listnode{
    int val;
    Listnode next;
    Listnode(int x){ 
        val=x;
    next=null;
    }
}
public class DetectCycleInLL {
   
    static public boolean hasCycle(Listnode head){
Listnode fast=head;
Listnode slow=fast;
while(fast!=null&&fast.next!=null){
    fast=fast.next.next;
slow=slow.next;
if(slow==fast){
    return true;
}
}
return false;
}


// approch-----2 by hashmap
// HashMap<ListNode, Boolean> visitedMap = new HashMap<>();
// ListNode temp = head;
// while(temp!=null){
//     ListNode ref = temp;
//     if(visitedMap.get(ref)!=null){
//         return true;
//     }
//     else{
//         visitedMap.put(ref, true); // Visited Mark
//     }
//     temp = temp.next;
// }
// return false;
public static void main(String[] args) {
System.out.println("Enter nodes");
   int pos=1;

  Listnode Node=null;
  Node=new Listnode(3);
  Node.next=new Listnode(2); 
  Node.next.next=new Listnode(0); 
  Node.next.next.next=new Listnode(-4);

 while(Node!=null)
 {Node=Node.next; }

 Listnode tail=Node;
 tail.next=Node.pos;
 System.out.println(hasCycle(Node));
}
}
