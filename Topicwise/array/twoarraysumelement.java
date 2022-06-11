public class twoarraysumelement {
    public static void main(String[] args) {
        int first[] = { 2, 3, 4, 2 };
        int second[] = { 9, 1, 2, 1 };
        int third[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1; // get the last index
        int j = second.length - 1;
        int k = third.length - 1;
        int carry = 0;
        // int digitSum = 0;
        // loop last to first
        while (i >= 0 || j >= 0) { // either first array will be exhaust or the second array
            int digitSum = carry; // store the single single digit sum
            if (i >= 0) { // might be i will exhaust
                digitSum += first[i]; // from the first array get the single digit and sum it
            }
            if (j >= 0) { // might be j will be exhaust
                digitSum += second[j]; // from the second array get the single digit and sum it
            }
            carry = digitSum / 10; // compute the carry
            digitSum = digitSum % 10; // get the digit
            third[k] = digitSum; // now store the single digit result in the third array
            i--; // move to the previous index move
            j--;
            k--;
        }
        // Print the result array (third)
        if (carry > 0) {
            System.out.print(carry);
        }
        for (int e : third) {
            System.out.print(e + " ");
        }

    }
}
