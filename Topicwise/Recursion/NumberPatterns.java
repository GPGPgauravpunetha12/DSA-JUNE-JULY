public class NumberPatterns {

  //////////////////////////////////////////////////////////////// // Pattern-1

  // 1
  // 12
  // 123
  // 1234
  // 12345

  // public static void main(String[] args) {

  //     int row=1;
  //     int  n=5;
  //     repeatNOpyramid(n,row);
  //    }

  //  static void repeatNOpyramid(int n, int row) {
  //     if(row>n)
  //     return;
  // PrintNumber(row);
  // System.out.println();//new line
  // repeatNOpyramid(n,row+1);

  // }

  // public static void PrintNumber(int noOfNumber) {
  //     //termination
  //     if(noOfNumber==0){
  //         return;
  //     }

  //     PrintNumber(noOfNumber-1);
  //     System.out.print(noOfNumber);

  // public static void main(String[] args) {
  // ////////////////////////////////////////////////////////////////////////// // Pattern-2

  //         // 1
  //         // 22
  //         // 333
  //         // 4444
  //         // 55555

  //     int row=1;
  //     int  n=1;
  //     repeatNOpyramid(n,row);
  //    }

  //  static void repeatNOpyramid(int n, int row) {
  //     if(row==6||n==6)
  //     return;
  // PrintNumber(row,n);
  // System.out.println();//new line
  // repeatNOpyramid(n+1,row+1);

  // }

  // public static void PrintNumber(int noOfNumber,int jk) {
  //     //termination
  //     if(jk==0){
  //         return ;
  //     }
  //     System.out.print(noOfNumber);

  //     PrintNumber(noOfNumber,jk-1);

  public static void main(String[] args) {
    //////////////////////////////////////////////////////////////////// Pattern-3

    // 1
    // 23 
    // 456
    // 78910
    // 1112131415
   
    int row = 1;
    int n = 1;
    repeatNOpyramid(n, row);
  }

  static void repeatNOpyramid(int n, int row) {
    if (row == 5|| n == 6) return;
    PrintNumber(row, n);
    System.out.println(); //new line
    
    repeatNOpyramid(n + 1, row + n);
  }

  public static void PrintNumber(int noOfNumber, int jk) {
    //termination
    if (jk == 0) {
      return;
    }
    System.out.print(noOfNumber);

    PrintNumber(noOfNumber+1, jk - 1);
  }
}
