
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LargestRectangularArea {
    static int area=0;
  static int count=1;
    static void LargestRectangularElement(int arr[]) {
    ArrayList<Integer> aux = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[0]);
    // aux.add(-1);
 for (int i = 1; i < arr.length; i++) {
    area=stack.peek();
  while (!stack.isEmpty() && stack.peek() >=arr[i] ) {
    area=0;
    // if(arr[i-1]<=arr[i]){
    //     area+=stack.peek()-arr[i];
    // } 
     stack.pop();
   
   }
   while (!stack.isEmpty() && stack.peek() <=arr[i] ) {
    count++;
    area*=count;
    stack.pop();
   
  }
 
    //   area+=arr[i];
      int LargestRectangular = stack.isEmpty() ? area :0;
      aux.add(LargestRectangular);
stack.push(arr[i]);

    }

 System.out.println(Collections.max(aux));
   
  }

  public static void main(String[] args) {
     int[] arr = {2,4};

    // { 23, 45, 13, 6, 40 };

    LargestRectangularElement(arr);
  }
}
