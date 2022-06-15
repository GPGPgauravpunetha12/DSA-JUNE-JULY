
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class luckyno {
  public static int findLucky(int[] arr) {
     
    //         int[] lno = new int[501];
    //         for(int i = 0; i < arr.length; i++){
    //             lno[arr[i]]++;
    //         }
       
    //         for(int j = lno.length-1; j > 0; j--){
    //             if(j == lno[j]){
    //                 return j;
    //             }   
    //         }
    //         return -1;
                 int count=0;
            int i=0;
          List <Integer> list=new ArrayList<>();
         while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
              count++;
              if(count==arr[i])  {
               list.add(count);
                     }
                
                                     }
            else{
                i++;
            }
                       }
       
           return (i==arr.length-1)? Collections.max(list):-1;
        }
  
      
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        findLucky(arr);
        System.out.println(findLucky(arr));
    }
    }