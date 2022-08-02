import java.util.ArrayList;
// https://practice.geeksforgeeks.org/problems/rotate-bits4524/1
import java.util.Scanner;

public class GfgRotateBits {
    public static void main(String[] args) {
      
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int d = sc.nextInt();
                
                
                ArrayList<Integer> res = GfgRotateBits.rotatebitt(n, d);
System.out.println(res);
   }
        }
    }
    public static ArrayList<Integer>  rotatebitt(int n, int noOfTimes) {
         int TOTAL_BITS =16;
  
        ArrayList<Integer> list=new ArrayList<>();
       noOfTimes=noOfTimes%16;
           list.add(((n<<noOfTimes)|n>>(TOTAL_BITS-noOfTimes))& 0xFFFF);
           list.add(((n>>noOfTimes)|n<<(TOTAL_BITS-noOfTimes)) & 0xFFFF);
           
            return list ;
    }
}
