class Task6 {
    public void moveZeroes(int[] nums) {
        int i,j=0;
        int n=nums.length;
        for(i=0; i<n; i++){
            if (nums[i]!=0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
            }
        }
    
}
