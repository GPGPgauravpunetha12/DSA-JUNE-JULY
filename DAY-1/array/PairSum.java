import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int nums[] = { 2, 9, 4, 3, 1, 10, 6 };
        int[] a = new int[2];
        int b[] = new int[nums.length];
        // b = nums; // reference copy
        System.arraycopy(nums, 0, b, 0, nums.length); // value copy
        Arrays.sort(nums);
        for (int e : nums) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : b) {
            System.out.print(e + " ");
        }

        // int i=0;int j=nums.length-1;
        // while(i<j){
        // int k=nums[i]+nums[j];
        // if(k==target){
        // for(int h=0;h<b.length;h++){
        // if(b[h]==nums[i]){
        // a[0]=h;
        // }else if(b[h]==nums[j]){
        // a[1]=h;
        // }
        // }
        // break;
        // }
        // else if(k>target){
        // j--;
        // }else if(k<target){
        // i++;
        // }

        // }return a;
    }
}
