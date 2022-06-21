public class NoOfZeroDigit {
    public static int isZERO(int n) {
        if(n<=9)
        return  0;
     
   //small problem
  
    return ((n%10==0)?1:0)+isZERO(n/10);
    }
    public static void main(String[] args) {
        int n=1002098030;
    
      System.out.println(  isZERO(n));
    }
}
