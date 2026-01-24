class Q3_Max_Consecutive_One{
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }
            if(count>max){
                max=count;}
            if(nums[i]==0){
                count=0;
            }

        }
        return max;
        
    }
}