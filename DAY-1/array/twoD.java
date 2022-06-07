/**
 * twoD
 */
public class twoD {

    public static void main(String[] args) {
        // int [][] r2={{10,2},{2,4},{0,2}};
   
        int [][] r4=new int[3][];
        r4[0]=new int[10];
        r4[1]=new int[20];
        r4[2]=new int[30];
        //zizg zag array

        // 0,1,2 

        //traverse array
        for (int i=0; i<r4.length; i++){
            for (int j=0; j<r4[i].length;j++)
            {
        System.out.print(r4[i][j]+" ");
    } 
    System.out.println("  ");
        }
       
    

    //enhance for loop take our=t 1d from 2d than takeout element from 1d
    // for(int a[]: r4){
    //     for(int ele :a){
    //         System.out.print(ele+" ");
    //     }
    //     System.out.println();
    // }
}}