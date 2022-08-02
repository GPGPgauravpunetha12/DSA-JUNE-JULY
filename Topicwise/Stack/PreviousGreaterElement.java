import java.util.Stack;

public class PreviousGreaterElement {
    static void approch1(int array[]){
for (int index = 0; index < array.length; index++) {
    for (int j = index-1; j >= 0; j--) {
        if(array[j]>array[index]){
            System.out.println(array[j]);
            break;
        }
    if(j==-1)
    System.out.println(-1+" ");


    }
}
}

static void app2(int array[]){
    Stack <Integer> stack =new Stack<>();
    stack.push(array[0]);
    System.out.println(-1+"  ");
    for (int i = 1; i < array.length; i++) {
        while(!stack.empty()&& stack.peek()<=array[i]){
            stack.pop();
        }
        int prevGreatElement=stack.empty()?-1:stack.peek();
        System.out.println(prevGreatElement+" ");
stack.push(array[i]);
    }
}
//previous smaller elements
static void prevsmaller(int array[]){
    Stack <Integer> stack =new Stack<>(); 
    stack.push(array[0]);
    System.out.println(-1+"  ");
    for (int i = 1; i < array.length; i++) {
        while(!stack.empty()&& stack.peek()>=array[i]){
            stack.pop();
        }
        int prevSmallerElement=stack.empty()?-1:stack.peek();
        System.out.println(prevSmallerElement+" ");
stack.push(array[i]);
    }
}
    public static void main(String[] args) {
        int array[]={12,1,3,52,5,6 };
        // approch1(array);
// app2(array);
//prev smaller
prevsmaller(array);
System.out.println();
}}
