class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
class  splitInTwoHalf
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
         // Mid of the LL
             Node start = list.head;
             Node slow, fast;
             slow = fast = start;
             while(fast.next!=start && fast.next.next!=start){
                 fast = fast.next.next;
                 slow = slow.next;
             }
             if(fast.next.next== start){
                 fast = fast.next;
             }
             list.head1 = start;//head of first half
             if(start.next!=start){
                 list.head2 = slow.next;//head of Second half
             }
             fast.next = slow.next;
             slow.next = start;
             
	 }
}
