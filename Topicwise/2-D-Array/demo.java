//   import java.util.ArrayList;

//     public class demo {
//         public static void main(String[] args) {
//             int arr[][] = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
//             ArrayList<Integer> minInRow = new ArrayList<>();
//             ArrayList<Integer> maxInCol = new ArrayList<>();
//             int min = Integer.MAX_VALUE;
//             int max = Integer.MIN_VALUE;
//             // Row Major Order
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {
//                     min = Math.min(min, arr[i][j]);
//                 }
//                 minInRow.add(min);
//                 min = Integer.MAX_VALUE;
    
//             }
    
//             // Column Major Order
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {
//                     max = Math.max(max, arr[j][i]);
//                 }
//                 maxInCol.add(max);
//                 max = Integer.MIN_VALUE;
    
//             }
//             // Compare Min in Row and Max in Col
//             for (int m : minInRow) {
//                 if (maxInCol.contains(m)) {
//                     System.out.println("Lucky No " + m);
//                 }
//             }
//         }
//     }
    