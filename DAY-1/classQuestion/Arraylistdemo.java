package classQuestion;


import java.util.ArrayList;
import java.util.Collections;



public class Arraylistdemo {
    public static void main(String[] args) {
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
        return lead;}}