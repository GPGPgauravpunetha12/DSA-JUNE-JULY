 class demo {
    int arr[];
    int top;
    int capacity;
    demo(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
 }


 int push(int element){
if(top==capacity-1)
    throw new RuntimeException("Stack is full");
    top++;
    arr[top]=element;
    return arr[top];
 }


 int pop(){
    if(isEmpty())
        throw new RuntimeException("Stack is empty");
          int element=arr[top];
       top--;
       return element;
     }

     int peek(){
        if(isEmpty())
        throw new RuntimeException("Stack is empty");
        else
        return arr[top];
     }

     boolean isEmpty(){return top==-1;}
    }
public class DEMOSTACK
{
public static void main(String[] args) {
    demo myStack=new demo(5);
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);
    myStack.push(50);
System.out.println(myStack.peek());
System.out.println(myStack.pop());
System.out.println(myStack.peek());
System.out.println(myStack.push(90));
System.out.println(myStack.peek());
}
}     

