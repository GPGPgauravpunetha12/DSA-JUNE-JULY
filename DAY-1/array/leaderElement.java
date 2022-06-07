import java.util.ArrayList;
import java.util.Collections;

public class leaderElement {
    public static ArrayList<Integer> main(String[] args) {
        // int arr[] = { 10,100,1,3,2,70};
        
        // for (int i = 0; i < arr.length-1; i++) {
        //     if (arr[i] <arr[i+1]) 
        //         System.out.println("leader elements are  "+arr[i+1]);
        // }
        int arr[]={67,89,89,23,67};
        ArrayList<Integer> lead = new ArrayList<>();
        int leader = arr[arr.length - 1];
        lead.add(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] >= leader) {
                leader = arr[i];
                lead.add(arr[i]);
            }
        }
        Collections.reverse(lead);
        return lead;
    }}
    
