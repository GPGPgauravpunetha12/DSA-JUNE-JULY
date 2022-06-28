class Solution {
    int count=0;
    public int climbStairs(int n) {
        if(n==1)//if only one ele in array
            return 1;
        
int arr[]=new int[n+1];
        arr[1]=1;//min 1 step so started from 1
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}

 