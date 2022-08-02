import java.util.ArrayList;
import java.util.Collections;

public class RotateBits {
    

  static  ArrayList<Integer> rotateBits(int n, int rotateTimes){
    int res=0;
    ArrayList<Integer> list=new ArrayList<>();
    while(n>0  ) {
   res=n%2;
    list.add(res);
 n=n/2;
}
Collections.reverse(list);

while(list.size()>0 && rotateTimes>=1){
Collections.reverse(list);
    rotateTimes--;
}
return list;
  }

    public static void main(String[] args) {
        int n=10;
      
        int rotateTimes=1;
        

   System.out.println("rotate bits are "+rotateBits(n,rotateTimes));
    }
}
