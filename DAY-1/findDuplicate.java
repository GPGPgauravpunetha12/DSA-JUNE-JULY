public class findDuplicate {

        public static void main(String[] args) {
            int arr[] = { 1, 3, 4, 2, 2 };
            for (int i = 0; i < arr.length; i++) {
                int index = Math.abs(arr[i]) - 1;
                int value = arr[index];
                if (value < 0) {
                    System.out.println("Duplicate " + (index + 1));
                    return;
                } else {
                    // first time visit mark with negative
                    arr[index] = arr[index] * -1;
                }
            }
        }
    
    
}
