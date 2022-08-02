import javax.management.RuntimeErrorException;

class TwoStack {
    int arr[];
    int capacity;
    int leftTop;
    int rightTop;

    TwoStack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        leftTop = -1;
        rightTop = capacity;

    }

    void leftPush(int element) {
        if (leftTop < rightTop - 1) {
            leftTop++;
            arr[leftTop] = element;
        }
    }

    void rightPush(int element) {
        if (leftTop < rightTop - 1) {
            rightTop--;
            arr[rightTop] = element;
        }
    }

    int leftPop() {
        if (leftTop == -1) {
            throw new RuntimeException("Left Stack is Empty");
        }
        int element = arr[leftTop];
        leftTop--;
        return element;

    }

    int rightPop() {
        if (rightTop == capacity) {
            throw new RuntimeException("Right Stack is Empty");
        }
        int element = arr[rightTop];
        rightTop++;
        return element;
    }

    int leftPeek() {
        if (leftTop == -1) {
            throw new RuntimeException("Left Stack is Empty");
        }
        return arr[leftTop];
    }

    int rightPeek() {
        if (rightTop == capacity) {
            throw new RuntimeException("Right Stack is Empty");
        }
        return arr[rightTop];
    }
}

public class SpaceOptimiseStack {
    public static void main(String[] args) {
        TwoStack stack = new TwoStack(10);
        stack.leftPush(10);
        stack.leftPush(20);
        stack.leftPush(30);

        stack.rightPush(100);
        stack.rightPush(200);
        stack.rightPush(300);

        System.out.println(stack.leftPeek());
        System.out.println(stack.rightPeek());

        System.out.println("Left Pop");
        System.out.println(stack.leftPop());
        System.out.println(stack.leftPop());

        System.out.println("Right Pop");
        System.out.println(stack.rightPop());
        System.out.println(stack.rightPop());

    }
}
