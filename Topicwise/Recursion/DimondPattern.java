public class DimondPattern {
    public static void main(String[] args) {

// UPPER HALF PYRAMID PATTERN-1-------
//     *
//    ***
//   *****
//  *******
// *********
  //*******
   //*****
    //***
    //**
    // *


       int row=1;
        int  n=5;
        int demon=1;
        DemoNpyramid(n,row, demon);
       }
    
     static void DemoNpyramid(int n, int row, int demon) {
        if(n==0)
        return;
        spaces(n);
        PrintStar(row,demon);
    System.out.println();//new line 
    DemoNpyramid(n-1,row+3,demon+2);
    
    } 
    
    
    public static void spaces(int noofspaces) {
    if (noofspaces==0) {
        return;
    }
    System.out.print(" ");
    spaces(noofspaces-1);
    
    
    }
    
    public static void PrintStar(int noOfStar, int demon) {
        //termination
        if(demon==0){
            return;
        }
        System.out.print("*");
        PrintStar(2*noOfStar-1,demon-1);



//         int row=1;
//         int  n=5;
//         int demon=1;
//         DemoNpyramid(n,row, demon);
//        }
    
//      static void DemoNpyramid(int n, int row, int demon) {
//        if(n==5&&demon==0)
//        return;
//         spaces(n);
//         PrintStar(row,demon);
//     System.out.println();//new line 
//     DemoNpyramid(n-1,row+3,demon+2);

//     if(n==0)

//  downSpaces(n+1);
//  ULTAPYRAMID(demon,row);
//  System.out.println();// new line
//     } 
    
    
//     public static void ULTAPYRAMID(int demon, int staR_Decreament) {
//         if(demon==0||staR_Decreament==0){
//             return;
//         }
//         System.out.print("*");
//         PrintStar(staR_Decreament-2,demon-2);
//     }

//     public static void spaces(int noofspaces) {
//     if (noofspaces==0) {
//         return;
        
//     }
//     System.out.print(" ");
//     spaces(noofspaces-1);
    
    
//     }
    
//     public static void downSpaces(int noofspaces) {
//         if (noofspaces==6) {
//             return;
//         }
//         System.out.print(" ");
//         downSpaces(noofspaces+1);
       
        
//     }

//     public static void PrintStar(int noOfStar, int demon) {
//         //termination
//         if(demon==0){
//             return;
//         }
//         System.out.print("*");
//         PrintStar(2*noOfStar-1,demon-1);
    
    
    }}

    //in doubt solve laterON