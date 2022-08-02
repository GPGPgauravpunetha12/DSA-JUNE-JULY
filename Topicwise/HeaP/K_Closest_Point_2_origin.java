import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        int arr[][]={{-2,2},{1,3},{5,8},{0,1}};
        int k=2;
System.out.println(" closest is"+kClosest(arr,k));
    }
    public static int[][] kClosest(int[][] arr, int K) {
        
         PriorityQueue<Pair> maxHeap=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.getValue().compareTo(p1.getValue());
            }
        });
        
         for (int i=0;i<arr.length;i++){
            Integer integer = takeSquare(arr[i]);
            maxHeap.offer(new Pair(i,integer));
            if (maxHeap.size()>K)
                maxHeap.poll();
        }
        
        int rst[][]=new int[maxHeap.size()][2];
       int row=0;
        while(maxHeap.size()!=0){
           Pair p1= maxHeap.poll();
            rst[row][0]=arr[p1.getKey()][0];
            rst[row][1]=arr[p1.getKey()][1];
            row++;

        }
        
        return rst;
    }
    
        private static  Integer takeSquare(int[] ints) {
        return ((ints[0]*ints[0])+(ints[1]*ints[1]));
    }
    
}
class Pair{
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}


// USING MAX HEAP

// class Solution {
// public int[][] kClosest(int[][] points, int K) {
// PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
// for (int[] p : points) {
// maxHeap.offer(p);
// if (maxHeap.size() > K)
// maxHeap.poll();
// }
// int[][] ans = new int[maxHeap.size()][2];
// int i = 0;
// while (!maxHeap.isEmpty())
// ans[i++] = maxHeap.poll();
// return ans;
// }
// }

// Time Complexity- O(Nlogk)
// Space Complexity-O(n)