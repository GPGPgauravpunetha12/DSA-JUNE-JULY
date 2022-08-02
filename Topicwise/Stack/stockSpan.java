import java.util.Stack;

public class stockSpan {

   static void computespan(int Price[]) {
      Stack<Integer> spanstack = new Stack<>();
      spanstack.push(0);
      System.out.println(1 + " ");
      for (int i = 1; i < Price.length; i++) {
         while (!spanstack.isEmpty() && Price[spanstack.peek()] <= Price[i]) {
            spanstack.pop();
         }
         int span = spanstack.isEmpty() ? i + 1 : i - spanstack.peek();
         System.out.println(span + " ");
         spanstack.push(i);
      }
   }

   public static void main(String[] args) {
      int price[] = { 12, 15, 14, 13, 23, 21, 12, 20 };
      computespan(price);
   }
}
