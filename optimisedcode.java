class optimisedcode{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // Binary search to find the first occurrence
            int index = binarySearchFirstOccurrence(sorted, nums[i]);
            result[i] = index;
        }
        
        return result;
    }
    
    private int binarySearchFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = arr.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
}