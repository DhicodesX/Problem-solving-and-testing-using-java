class Task4 {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet();
       for (int i=0; i<nums.length; i++){
            int num=nums[i];
            if(!set.add(num)){
                return true;
            }
       }
       return false;
    }
}
