
public class FirstMissing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int xor=arr.length+1;
        for (int i = 0; i < xor; i++) { 
        xor ^= i ^ arr[i];
                    }
System.out.println(" First missing: " +xor);

    
    }
}
/**
 * Approach 2: Bit Manipulation 
 * Intuition
 * We can harness the fact that XOR is its own inverse to find the missing element in linear time.
 * Algorithm
 * Because we know that nums contains n numbers and that 
 * it is missing exactly one number on the range [0..n−1], 
 * we know that n definitely replaces the missing number in nums. 
 * Therefore, if we initialize an integer to n and XOR it with every index and value, 
 * we will be left with the missing number. 
 * 
 * Consider the following example 
 * (the values have been sorted for intuitive convenience, but need not be):
 *      Index   0   1   2   3
 *      Value   0   1   3   4
 *      missing = 4^(0^0)^(1^1)^(2^3)^(3^4)
 *              = (4^4)^(0^0)^(1^1)^(3^3)^2
 *              =0^0^0^0^2
 *              =2
 *              
 * Complexity Analysis
 * Time complexity : O(n)
 * Assuming that XOR is a constant-time operation, 
 * this algorithm does constant work on n iterations, so the runtime is overall linear.
 * Space complexity : O(1)
 * This algorithm allocates only constant additional space.
 */