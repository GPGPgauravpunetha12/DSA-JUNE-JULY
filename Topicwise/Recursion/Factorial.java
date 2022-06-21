public class Factorial {
    static int fact(int num){
      if(num==1)
      return 1;  //   terminatio ncase    
    //small problem 
  int smallresult =  fact(num-1);//next elementint smallresult

  return num*smallresult;//processing logic

    }
    public static void main(String[] args) {
        int n=5;
      int t=  fact(n);
      System.out.println(t);
    }
}

