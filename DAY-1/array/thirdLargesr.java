

public class thirdLargesr {
public static void main(String[] args) {
    int arr[] = { 10, 20, 5, 15, 11, 12, 20 };
    int max = -1;
    int secondLargest = -1;
    int thirdLargest = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            secondLargest = max;
            max = arr[i];
        }
        if (arr[i] != max) {
            // Checking Dup
            // make sure current element is not the first largest
            if (arr[i] > secondLargest) {
                thirdLargest=secondLargest;
                secondLargest = arr[i];
            }
        }
        if (arr[i] != max && arr[i] !=secondLargest) {
            // Checking Dup
            // make sure current element is not the first largest
            if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
    }
    System.out.println("First " + max + " Second " + secondLargest+"third"+thirdLargest);
}
    
}