public class maxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max_sum = Integer.MIN_VALUE;
        int cur=0;
        for(int x:nums)
        {
            if(cur<0) cur=0;
            cur += x;
            max_sum =  Math.max(max_sum , cur);
        }
       
        System.out.println(max_sum);
    }
}
