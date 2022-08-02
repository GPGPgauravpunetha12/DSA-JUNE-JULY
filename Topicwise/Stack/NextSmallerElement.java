import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {

  static void nextSmallerElement(int arr[]) {
    ArrayList<Integer> aux = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[arr.length - 1]);
    aux.add(-1);
    for (int i = arr.length - 2; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() >=arr[i] ) {
        stack.pop();
        while (!stack.isEmpty() && stack.peek() <=arr[i] ) {
          stack.pop();
        }
      }
     
      int nextSmaller = stack.isEmpty() ? -1 : stack.peek();
      aux.add(nextSmaller);
      stack.push(arr[i]);
    }
    Collections.reverse(aux);
    System.out.println(aux);
  }

  public static void main(String[] args) {
    int[] arr = { 23, 45, 13, 6, 40 };
    nextSmallerElement(arr);
  }
}
