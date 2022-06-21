public class _867_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int mat[][]=new int[matrix[0].length][matrix.length];//COL,ROW
        for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
             mat[j][i]=matrix[i][j];//COL,Row=Row,col
             
         }
     }
     
     return mat;      
 }
        
    
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(arr));
    }
}
