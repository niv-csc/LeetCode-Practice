class _3507_Minimum_Pair_Removal_to_Sort_Array_I{
    int functions(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (sum < minSum) {
                minSum = sum;
                index = i;
            }
        }
        return index;
    }

    
    int sorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return -1; 
            }
        }
        return 0;
    }

    public int minimumPairRemoval(int[] nums) {
        int count = 0;

        
        while (sorted(nums) != 0) {
            int idx = functions(nums);

        
            int[] newNums = new int[nums.length - 1];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (i == idx) {
                    newNums[j++] = nums[i] + nums[i + 1];
                    i++; 
                } else {
                    newNums[j++] = nums[i];
                }
            }
            nums = newNums;
            count++;
        }

        return count;
    }
}