import java.util.PriorityQueue;

public class ConnectingNRope {


    public static int minCostofRopes(int arr[]) {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<arr.length-1;i++) {
            minHeap.add(arr[i]);
        }
int ans=0;
while(minHeap.size()>1){//including 1
int first = minHeap.poll();
int Second = minHeap.poll();
int sum=first+Second;
ans+=sum;
minHeap.add(sum);}
return ans;
    }
    public static void main(String[] args) {
        int arr[] = {13,12,11,14,15,17,18,20,19,16};
       
       System.out.println("min cost of rope is ->  "+ minCostofRopes(arr));
    }
}
