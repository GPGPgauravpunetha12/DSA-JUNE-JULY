public class Array_leetcode_1394_Find_Lucky_Integer_in_an_Array{
    public static int  luckynois(int arr[]) {
        int[] lno = new int[501];
        for(int i = 0; i < arr.length; i++){
            lno[arr[i]]++;
        }
   
        for(int j = lno.length-1; j > 0; j--){
            if(j == lno[j]){
                return j;
            }   
        }
        return -1; 
    }
   public static void main(String[] args) {
    int arr[] ={2,2,3,4};
    System.out.println(luckynois(arr));
   }

}