
    import java.util.LinkedList;
    import java.util.List;
    
    public class LinkedList {
        public static void main(String[] args) {
            LinkedList<String> linkedlist = new LinkedList<>();
            linkedlist.addFirst("Ram");
            linkedlist.addLast("Ramesh");
            linkedlist.add("Shyam");
            linkedlist.add(1, "Tim");
            System.out.println(linkedlist);
            linkedlist.removeFirst();
            linkedlist.removeLast();
        }
    }
    