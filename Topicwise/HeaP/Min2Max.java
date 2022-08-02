import java.util.ArrayList;

public class MinToMax {//down heapify
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int data){
        list.add(data);
        // upHeapify(list.size()-1);
    }

    public void print(){
        for(int element : list){
            System.out.println(element);
        }
        System.out.println("***********************");
    }

    public int remove(){
        // Swap the Min Element (Top ) with the last element
        swap(0, list.size()-1); // The Bigger one is sitting on Top
        // Now remove the last element
        int lastElement = list.remove(list.size()-1);
        // So to place the element on current place (DownHeapify)

        downHeapify(0);
        return lastElement;
    }

    // MinToMax
    public void downHeapify(int parentIndex){
      int leftChildIndex = parentIndex * 2 + 1;
      int rightChildIndex = parentIndex * 2 + 2;
      int minIndex = parentIndex;
      // if leftChildIndex is less than array size && leftChild is less than the parent element
      // minIndex store LeftChildINdex 
      // otheerwise do it for the right
      if(leftChildIndex<list.size()-1 && list.get(leftChildIndex)< list.get(parentIndex)){
        minIndex = leftChildIndex;
      }
      else 
      if(rightChildIndex<list.size()-1 && list.get(rightChildIndex)< list.get(parentIndex)){
        minIndex = rightChildIndex;
      }
      // if minIndex is updated either for left or right
      // then do the swap
      if(minIndex!=parentIndex){
        swap(parentIndex, minIndex);
        downHeapify(parentIndex);
      }


    }

    // Compute the Parent Index and Swap Parent and Child Value 
    //maxtominheap
    // private void upHeapify(int childIndex){
    //    int parentIndex= (childIndex - 1)/2;
    //    if(list.get(childIndex)<list.get(parentIndex)){
    //       swap(parentIndex, childIndex);
    //       upHeapify(parentIndex);
    //    }
    // }
    private void swap(int parentIndex, int childIndex){
        int parentValue = list.get(parentIndex);
        int childValue = list.get(childIndex);
        list.set(childIndex, parentValue);
        list.set(parentIndex, childValue);
    }
}

public class Min2Max{
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(17);
        heap.add(18);
        heap.add(20);
        heap.print();
       heap.remove();
       heap.print();

    }
}
