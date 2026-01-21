import java.util.*;

class _3315_Construct_the_Minimum_Bitwise_Array_II {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);

            if (n == 2) {
                ans[i] = -1;
                continue;
            }

            // p = lowest set bit of (n + 1)
            int p = (n + 1) & -(n + 1);
            ans[i] = n - (p >> 1);
        }

        return ans;
    }
}
