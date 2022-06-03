public class RangeQuerySum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int element : prefixSum) {
            System.out.print(element + " ");
        }
        System.out.println();
        int lowerRange = 0;
        int upperRange = 5;
        if (lowerRange == 0) {
            System.out.println(prefixSum[upperRange]);
        } else {
            System.out.println(prefixSum[upperRange] - prefixSum[lowerRange - 1]);
        }
        int arr3[] = { 90, 10, 20, 100, 11, 200, 20, 300, 500 };
        int prefixMax[] = new int[arr3.length];
        prefixMax[0] = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr3[i]);
        }
        for (int p : prefixMax) {
            System.out.print(p + " ");
        }
        System.out.println();

    }
}
