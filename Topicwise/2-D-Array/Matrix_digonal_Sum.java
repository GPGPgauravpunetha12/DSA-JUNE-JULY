public class Matrix_digonal_Sum {
    public static int diagonalSum(int[][] mat) {
        //aPP-1 using bruteforce
       //         int sum=0;
       
        
//     for(int i=0;i<matrix.length;i++){
//              for(int j=0;j<matrix[i].length;j++){
              
//             if(i==j||(i+j)==matrix.length-1)
//               sum+= matrix[i][j];
                 
            
//     }
  
//     }
        
        
//        return sum;
        
        //Approch-2 improved approch
        int sum = 0;
        //FOR PRIMARY DIAGONAL
        for(int i =0; i<mat.length; i++){
            int j =i;
            sum = sum + mat[i][j];
        }
        //FOR SECONDARY DIAGONAL
        int j = mat.length-1;
        for(int i =0; i<mat.length; i++){
            if(i!=j){
                sum = sum + mat[i][j];
            }
            j--;
        }
        return sum;}
    public static void main(String[] args) {
       int diagonalSum [][]={{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(diagonalSum(diagonalSum));
    }
}
