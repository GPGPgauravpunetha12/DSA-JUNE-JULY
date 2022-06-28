public class RightPyramid {
    public static void main(String[] args) {
        int row=1;
    int  n=5;
    rightpyramid(n,row);
   }

 static void rightpyramid(int n, int row) {
    if(n==0)
    return;
    spaces(n);
    PrintStar(row);
System.out.println();//new line 
rightpyramid(n-1,row+1);

} 


public static void spaces(int noofspaces) {
if (noofspaces==0) {
    return;
}
System.out.print(" ");
spaces(noofspaces-1);


}

public static void PrintStar(int noOfStar) {
    //termination
    if(noOfStar==0){
        return;
    }
    System.out.print("*");
    PrintStar(noOfStar-1);
}}