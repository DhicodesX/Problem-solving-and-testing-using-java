class Task1 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxval=-10000;
        int sum =0;
        for (int i=0; i<n; i++){
            sum= Math.max(nums[i], sum+nums[i]);
            maxval=Math.max(sum,maxval);
            
        }
        return maxval;
    }
}
