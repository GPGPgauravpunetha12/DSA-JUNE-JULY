public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 21, 22, 30, 30, 30, 30, 30, 30, 90, 100 };
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int search = 30;
        int firstIndex = -1;
        int lastIndex = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                firstIndex = mid; // remember the firstindex
                high = mid - 1;
            }
            if (search > arr[mid]) {
                low = mid + 1; // left to right
            } else if (search < arr[mid]) {
                high = mid - 1; // right to left
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                lastIndex = mid; // remember the firstindex
                low = mid + 1; // move to the low to high index
            }
            if (search > arr[mid]) {
                low = mid + 1; // left to right
            } else if (search < arr[mid]) {
                high = mid - 1; // right to left
            }
        }
        System.out.println("First Index " + firstIndex + " Last Index " + lastIndex);

    }
}
