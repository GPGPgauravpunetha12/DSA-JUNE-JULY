
class twosum {
    public int[] twoSum(int[] nums, int target) { 
        if (nums.length == 0) return null;
        
        for (int i = 0, j = 1; i < nums.length && j < nums.length; j++) {
            int currNum = nums[i];
            int currRemain = target - currNum;
            
            if (nums[j] == currRemain) {
                return new int[]{i, j};
            }
            
            if (j == nums.length -1) { //j reaches end of array, no finding
                i++;
                j = i; //no need to start from beginning
            }
        }
        return null;
    }
}

//optimsed using hash map
// import java.util.Arrays;
// import java.util.HashMap;

// public class TwoSum {
//     public static void main(String[] args) {

//         int arr[] = { 2, 9, 6, 3, 1, 10, 4 };
//         int sum = 9;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int key = sum - arr[i];
//             if (map.get(arr[i]) == null) { // This key is not present
//                 map.put(key, i); // put the key , add the new key
//             } else { // u found the key
//                 System.out.println("Pair Found " + map.get(arr[i]) + " current index " + i);
//             }
//         }
        // Arrays.sort(arr); // N Log N
        // // Two Pointer Approach
        // int i = 0;
        // int j = arr.length - 1;
        // int sum = 9;
        // while (i < j) {
        // int k = arr[i] + arr[j];
        // if (sum == k) {
        // System.out.println(arr[i] + " " + arr[j] + " i index " + i + " and j index "
        // + j);
        // return;
        // } else if (k > sum) {
        // j--;
        // } else if (k < sum) {
        // i++;
        // }
        // }

//     }
// }
