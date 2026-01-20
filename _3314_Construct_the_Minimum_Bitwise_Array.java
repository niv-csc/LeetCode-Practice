class _3314_Construct_the_Minimum_Bitwise_Array {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            int x = -1;

            
            for (int j = 0; j < n; j++) {
                if ((j | (j + 1)) == n) {
                    x = j;
                    break; 
                }
            }

            ans[i] = x;
        }

        return ans;
    }
}
          