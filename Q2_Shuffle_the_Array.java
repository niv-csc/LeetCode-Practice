class Q2_Shuffle_the_Array{
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            arr[j++] = nums[i];     // first half
            arr[j++] = nums[i + n]; // second half
        }
        
        return arr;
    }
}