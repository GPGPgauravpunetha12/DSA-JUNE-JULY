public class StackUsingDLL {


    static class Node {
        int data;
        Node prev;
        Node next;
    };
    
    static Node start = null;
    static Node top = null;
    
    // Check if stack is empty
    public static boolean isEmpty() {
        if (start == null)
        return true;
        return false;
    }
    
    // pushes element onto stack
    public static void push(int d) {
        Node n;
        n = new Node();
        n.data = d;
        if (isEmpty()) {
        n.prev = null;
        n.next = null;
    
        // As it is first node if stack
        // is empty
        start = n;
        top = n;
        } else {
        top.next = n;
        n.next = null;
        n.prev = top;
        top = n;
        }
    }
    
    // Pops top element from stack
    public static void pop() {
        Node n;
        n = top;
        if (isEmpty())
        System.out.println("Stack is empty");
        else if (top == start) {
        top = null;
        start = null;
        n = null;
        } else {
        top.prev.next = null;
        top = n.prev;
        n = null;
        }
    }
    
    // Prints top element of the stack
    public static void topelement() {
        if (isEmpty())
        System.out.println("Stack is empty");
        else
        System.out.println("The element at top of the stack is : " + top.data);
    }
    
    // Determines the size of the stack
    public static void stacksize() {
        int c = 0;
        if (isEmpty())
        System.out.println("Stack is empty");
        else {
        Node ptr = start;
        while (ptr != null) {
            c++;
            ptr = ptr.next;
        }
        }
        System.out.println("Size of the stack is : " + c);
    }
    
    // Determines the size of the stack
    public static void printstack() {
        if (isEmpty())
        System.out.println("Stack is empty");
        else {
        Node ptr = start;
        System.out.print("Stack is : ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("");
        }
    }
    
    // Driver code
    public static void main(String args[]) {
        push(2);
        push(5);
        push(10);
        printstack();
        topelement();
        stacksize();
        pop();
        System.out.println("\nElement popped from the stack ");
        topelement();
        pop();
        System.out.print("\nElement popped from the stack \n");
        stacksize();
    }
    }
    