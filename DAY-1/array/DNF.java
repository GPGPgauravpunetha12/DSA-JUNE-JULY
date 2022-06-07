public class DNF {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 2, 0, 1 };
        // {0,0,0}
        int low;
        int mid;
        low = mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;

                    break;

            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
