public class demo {
 public static void main(String[] args) {
    System.out.println("I am recursion");
    main(null);// so recursion maintain stack  to avoid  overflow
 }
}
