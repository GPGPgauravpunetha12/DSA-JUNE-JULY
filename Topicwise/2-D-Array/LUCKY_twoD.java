 class LUCKY_twoD {
    
        public static void main(String[] args) {
            // int arr[] [] = new int[3][3]; // fill with 0
            // int [][] arr2 = new int[3][4];
            // int []arr3[] = new int[3][3];
            int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
            // int[][] arr5 = new int[3][];
            // arr5[0] = new int[10];
            // arr5[1] = new int[20];
            // arr5[2] = new int[30];
            // Traverse
            // for (int i = 0; i < arr5.length; i++) {
            // for (int j = 0; j < arr5[i].length; j++) {
            // System.out.print(arr5[i][j] + " ");
            // }
            // System.out.println();
            // }
            // One D Get from the TwoD
            // for (int a[] : arr5) {
            // // Get the value from the ONe-D
            // for (int e : a) {
            // System.out.print(e + " ");
            // }
            // System.out.println();
            // }
            // Row Major Order
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            // Column Major Order
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }
        }
    }