

class Reverse {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   
    //App---------------------------2 function, len and get value----------------------------
     private  int len(ListNode head){ // for calculating end of linklist
      int length=0;
      ListNode temp=head;
      while(head!=null)
               {length++; temp=temp.next;}
                  return length;
               }
     
     
     
     private ListNode getValue(int index,ListNode head){
         ListNode temp=head;
         for(int i=0;i<=index;i++){
             temp=temp.next;
         }
         return temp;
     }
    
        
        
        public ListNode reverseList(ListNode head) {
         
 //     if (head == null || head.next == null) {
 //             return head;
 //         }
            
            
            
     //     ListNode last = reverseList(head.next);
     //     head.next.next = head;
     //     head.next = null;
     //     return last;
     
            
            
            
     //app2-traverse ulta 
      
     int i=0;
         int j=len(head)-1;
     while(i<j){
         ListNode rightNode=getValue(i,head);
         ListNode leftNode=getValue(j,head);
                 int temp=rightNode.val;
         rightNode.val=leftNode.val;
         leftNode.val=temp;
         i++;
         j--;
     }
         return head;
            
            
            
           
            
            
            ////AppRoch-----3 -------------USING-------3----Pointer--------------------
          
    //         if(head==null)
    //             return head;
            
    //         ListNode prev=head;
    //         ListNode curr=prev.next;
        
    //         while(curr!=null){
    //                 ListNode ahead=curr.next;
    //             curr.next=prev;
    //            prev=curr;
    //           curr=ahead;
    //         }
    //         ListNode temp=head;
    //         head=prev;
    //         temp.next=null;
            
    // return head;         
     }}