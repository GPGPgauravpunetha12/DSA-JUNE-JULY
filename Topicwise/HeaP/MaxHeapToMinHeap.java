import java.util.ArrayList;

// Min Heap (Min Element on TOP ) Parent < Child
class Heap{
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int data){
        list.add(data);
        upHeapify(list.size()-1);
    }

    public void print(){
        for(int element : list){
            System.out.println(element);
        }
        System.out.println("***********************");
    }

  

    // Compute the Parent Index and Swap Parent and Child Value
    private void upHeapify(int childIndex){
       int parentIndex= (childIndex - 1)/2;
       if(list.get(childIndex)<list.get(parentIndex)){
          swap(parentIndex, childIndex);
          upHeapify(parentIndex);
       }
    }
    private void swap(int parentIndex, int childIndex){
        int parentValue = list.get(parentIndex);
        int childValue = list.get(childIndex);
        list.set(childIndex, parentValue);
        list.set(parentIndex, childValue);
    }
}

public class MaxHeapToMinHeap {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(29);
        heap.add(31);
        heap.add(1);
        heap.add(20);
        heap.add(10);
        heap.add(1);
       heap.print();
    //    heap.remove();
    //    heap.print();

    }
}
