import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {13,12,11,14,15,17,18,20,19,16};
        int k = 4;
        PriorityQueue<Integer> heap = new 
        PriorityQueue<>((Integer first, Integer second)->first - second);// sort in ascending Order
        for(int element : arr){
             heap.add(element);
            if(heap.size()>k){
                heap.poll();
            }
        }
        System.out.println(heap.poll());
       
        //System.out.println(heap);

    }
}