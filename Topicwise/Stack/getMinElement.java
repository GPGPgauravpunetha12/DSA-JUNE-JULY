import java.util.Stack;

public class getMinElement {
    int min=0;
    Stack<Integer> stack =new Stack<>();
  
    void push(int element) {   
   
    if(stack.isEmpty()){
min= element;
stack.push(element);
    }
else if(element<=min){
stack.push(element-min);
min= element;
}
else{
    stack.push(element);
}
}
 int getMin(){
    return min;
 }
 int pop(){
    int element = stack.pop();
    if(element <0){
int result=min;
min=min-element;
return result;
    }
    else{
        return element;
    }
 }
    public static void main(String[] args) {
        
    }
}
