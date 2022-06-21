public class Pattern {
   public static void main(String[] args) {
    int row=1;
    int  n=5;
    leftpyramid(n,row);
   }

 static void leftpyramid(int n, int row) {
    if(row>n)
    return;
PrintStar(row);
System.out.println();//new line 
leftpyramid(n,row+1);

} 


public static void PrintStar(int noOfStar) {
    //termination
    if(noOfStar==0){
        return;
    }
    System.out.print("*");
    PrintStar(noOfStar-1);
}
}
