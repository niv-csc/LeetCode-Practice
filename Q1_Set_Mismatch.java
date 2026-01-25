class Q1_Set_Mismatch{
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];  
        int[] result = new int[2];
        
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) result[0] = i; 
            if (count[i] == 0) result[1] = i; 
        }
        
        return result;
    }
}