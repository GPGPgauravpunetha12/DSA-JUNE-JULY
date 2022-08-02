
 class CircularQueue {
    int data[];
    int front;
    int rear;

    CircularQueue(int capacity) {
        data = new int[capacity];
        front = rear = 0;
    }

    void enqueue(int element) {
        if (data.length == rear) {
            throw new RuntimeException("circular queue is full");
        }
        int index = (front + rear) % data.length;
        data[index] = element;
        rear++;
    }

    int dequeue() {
        if (rear == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        int element = data[front];
        data[front] = 0; // delete
        front = front + 1;
        rear--;
        return element;
    }

    void print() {
        for (int i = 0; i < rear; i++) {
            int index = (front + i) % data.length;
            System.out.println(data[index]);
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(10);
        cq.print();
        System.out.println("*****************");
        cq.dequeue();
        cq.dequeue();
        cq.print();
    }
}
