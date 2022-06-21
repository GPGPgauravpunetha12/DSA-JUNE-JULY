public class SortedorNot {
    
    public static void main(String[] args) {
      int a[] = {1,2,3,4,5,6,27,8,9,10};
   
   

      System.out.println( (isSON(a,0)?"sorted":"not sorted"));
    }

  public static boolean isSON(int[] a, int index) {
    int n= a.length-1;
   if(n==index)
return true;
  //small problem 
  if(a[index]>a[index+1]){
    return false;     }
  index =index+1;
  return isSON(a,index);
    }
}
