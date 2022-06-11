public class subarraysumequaltok {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        int k=3;
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                cnt++;
            }
        }
    }
}
