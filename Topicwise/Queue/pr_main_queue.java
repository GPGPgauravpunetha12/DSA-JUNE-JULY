import java.util.PriorityQueue;

public class pr_main_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr = new PriorityQueue<>((Integer a, Integer b) -> a.compareTo(b));
        pr.offer(10);
        pr.offer(1);
        pr.offer(20);
        pr.offer(100);
        pr.offer(50);
        pr.offer(3);
        pr.offer(30);
        pr.offer(1000);
        System.out.println(pr);
        System.out.println(pr.poll());
        System.out.println(pr.poll());

        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());

        System.out.println(pr.poll());  
    }
}
