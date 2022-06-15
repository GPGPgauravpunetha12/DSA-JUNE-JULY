public class _48_Rotate_image {
        public static void rotate(int[][] matrix) {
            // 1st Step Transpose of Matrix
            for(int i  = 0; i<matrix.length; i++){
                for(int j = i+1; j<matrix.length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            
            // 2nd Step Reverse Each Row
            for(int [] row : matrix){
                for(int i = 0, j = matrix.length-1;i<matrix.length/2; i++, j-- ){
                    int temp = row[i];
                    row[i] = row[j];
                    row[j] = temp;
                }
            }}
            public static void main(String[] args) {
                int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
                System.out.println(rotate(arr));
            }
        }
    
