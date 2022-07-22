public class RotateAnArray {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 2;
        k = k % arr.length; // Overflow Range
        // System.out.println("After Overflow " + k);
        // Negative Case
        if (k < 0) {
            k = arr.length + k;
        }
        // reverse the first part of the array
        reverse(arr, 0, arr.length - k - 1);
        // reverse the second part of the array
        reverse(arr, arr.length - k, arr.length - 1);
        // reverse the full array
        reverse(arr, 0, arr.length - 1);

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}