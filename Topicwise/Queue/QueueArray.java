 class Queue {
    int data[]; // store queue values
    int front; // point on start
    int rear; // point at end
    int size; // Queue Size

    Queue(int capacity) {
        data = new int[capacity];
        front = rear = -1;
        size = 0; // Queue is Empty

    }

    void enqueue(int element) {
        // Queue is Full
        if (size == data.length) {
            throw new RuntimeException("Queue is Full");
        }
        // Is Queue is Empty
        if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = element;

    }

    int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        int frontElement = data[front];
        front++; // front move to next element
        if (front == data.length) {
            front = 0;
        }
        size--;
        if (isEmpty()) {
            front = rear = -1;
        }
        return frontElement;
    }

    int getSize() {
        return size;
    }

    int getFront() {
        if (getSize() == 0) {
            throw new RuntimeException("No Front Queue is Empty");
        }
        return data[front];
    }

    int getRear() {
        if (getSize() == 0) {
            throw new RuntimeException("No Front Queue is Empty");
        }
        return data[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);

        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.getFront());

    }
}
