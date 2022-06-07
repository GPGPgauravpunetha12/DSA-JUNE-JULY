public class WaveArrayDemo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swapping Logic
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }
        for (int t : arr) {
            System.out.print(t + " ");
        }
    }
}
