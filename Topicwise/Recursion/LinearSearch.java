public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,1};
        int srch=1;
        int index;
        findNumber(a,srch,0);
        System.out.println("Search the index of A Number"+ findNumber(a,srch,0));
    }

    private static int findNumber(int[] a, int srch,int index) {
        int n= a.length-1;
        if(n==index)
     return n;
   if(a[index]==srch){
    return index;
   }else{
   index++;}
 
   return   findNumber(a,srch,index);
    }
}
