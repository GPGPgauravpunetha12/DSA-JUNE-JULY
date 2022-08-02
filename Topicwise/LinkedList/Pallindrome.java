class Listnode {
         int val;
         Listnode next;
         Listnode() {}
         Listnode(int val) { this.val = val; }
         Listnode(int val, Listnode next) { this.val = val; this.next = next; }
     }
public class Pallindrome {
    private static Listnode reverse(Listnode currentNode, Listnode prevNode){
        if(currentNode == null){
            return prevNode; // Last Node (Become Start/ Head)
        }
        Listnode ahead = currentNode.next;
        currentNode.next = prevNode;
        return reverse(ahead, currentNode );
        
    }
    private static boolean compare(Listnode node, Listnode secondHalf){
        while(node!=null && secondHalf!=null){
            if(node.val == secondHalf.val){
                node = node.next;
                secondHalf = secondHalf.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(Listnode head) {
        Listnode slow,fast;
         Listnode mid=null;
         Listnode prevNode=null;
          slow=fast=head;
       while(fast!=null&&fast.next!=null){//even list
           fast=fast.next.next;
              prevNode = slow;
           slow=slow.next;
   }
  
      if(fast!=null)    //ODD LISt{
      {
          mid=slow;
          slow=slow.next;
        }
       
 //create Second half Of the List
        Listnode secondhalf=slow;
      prevNode.next=null;// imp part previous node before the slow
        
  //  1->first while with two condition will run
   // 2-initialy slow=prevnode=head after prev node at next Iter2 slow.next will be updated to prev node and fast will reach null NOW HERE PREVNODE IS AS IT IS THEN SLOW wILL UPDATE  AFTER IT WHILE LOOP EXHAUST SO PREV NODE WILL BE BEFORE THE SLOW NODE
    //3->fast will move two pt and slow will move 1 point
 //   4->THEN PREV.NEXT WILL MAKE FIRST HALF BY BREAKING CONNECTION FRFOM MID-1
    
        //REVERSE THE SECOND HALF
secondhalf=reverse(secondhalf,null) ;       
 
        //     compare first half with second half
        boolean result=compare(head,secondhalf);
        
        //undo the Reverse
        secondhalf=reverse(secondhalf,null);

 // Recreate the Org List
 if(mid!=null){
     prevNode.next = mid;
     mid.next = secondhalf;
 }
 return result;
   
    }
    public static void main(String[] args) {
        Listnode Node=null;
        Node=new Listnode(3);
        Node.next=new Listnode(2); 
        Node.next.next=new Listnode(2); 
        Node.next.next.next=new Listnode(3);
        System.out.println(isPalindrome(Node));
    }
}