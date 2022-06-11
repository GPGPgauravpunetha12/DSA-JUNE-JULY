public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        int n = arr.length;
        int peakElement = 0;
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) { // start index
                if (arr[i + 1] > arr[i]) {
                    peakElement = arr[i + 1];
                }

            } else if (i == n - 1) { // last index
                if (arr[i - 1] < arr[i]) {
                    peakElement = arr[i];
                }
            } else // neighbour check
            {
                if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                    peakElement = arr[i];
                }
            }
        }
        System.out.println("Peak Element " + peakElement);
    }
}
