public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        fib(n);
       
    }

    public static int fib(int n) {
        if (n <= 1)
        return n;
     return fib(n-1) + fib(n-2);
}

    }
