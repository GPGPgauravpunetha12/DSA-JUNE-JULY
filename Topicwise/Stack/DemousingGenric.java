import static java.lang.System.out;

import java.util.ArrayList;

class MyStack<T> {
    // T arr[];
    ArrayList<T> arr;
    int top;
    int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        // arr = new T[capacity]; // all are field with 0
        arr = new ArrayList<>(capacity);
        top = -1;
    }

    void push(T element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is Full Can't Add it...");

        }
        top++;
        // arr[top] = element;
        arr.add(top, element);

    }

    T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty can't pop...");

        }
        // pop top most element
        // int element = arr[top];
        T element = arr.get(top);
        top--;
        return element;
    }

    T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty !...");

        } else {
            return arr.get(top);
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(10);
        MyStack<String> stack2 = new MyStack<>(20);
        stack2.push("Amit");

    }
}
