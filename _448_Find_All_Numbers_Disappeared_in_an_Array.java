import java.util.*;
class _448_Find_All_Numbers_Disappeared_in_an_Array{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];  

        
        for (int num : nums) {
            seen[num] = true;
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                output.add(i);
            }
        }

        return output;
    }
}