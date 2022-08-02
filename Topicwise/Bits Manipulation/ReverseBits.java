import java.util.ArrayList;
import java.util.Scanner;

/**
 * ReverseBits
 */
public class ReverseBits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int res=0;
    ArrayList<Integer> list=new ArrayList<>();
    while(n>0  ) {
   res=n%2;
    list.add(res);
 n=n/2;
}
System.out.println(list);
    }
}