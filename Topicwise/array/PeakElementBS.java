public class PeakElementBS {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        int n = arr.length;

        int low = 0;
        int high = arr.length - 1;
        if (n == 1) { // if array of one size
            System.out.println(arr[0]);
            return;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    System.out.println(arr[mid]);
                    return;
                } else if (arr[mid - 1] > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    System.out.println(arr[0]);
                    return;
                } else {
                    System.out.println(arr[1]);
                    return;
                }
            } else if (mid == n - 1) {
                if (arr[n - 1] > arr[n - 2]) {
                    System.out.println(arr[n - 1]);
                    return;
                } else {
                    System.out.println(arr[n - 2]);
                    return;
                }
            }
        }

    }
}
