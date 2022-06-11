public class spanofarray {
    public static void main(String[] args) {
        int arr[] = { 10,100,1,3,2,70};
    int max = -1;
    int min= arr[0];
int span = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
           max = arr[i];
        }
        if (arr[i] <min) {
            min = arr[i];
         }
         
    }
    span=max-min;
    System.out.println("SPAN OF ARRAY  "+span);
}
}