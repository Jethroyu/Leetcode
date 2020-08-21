package Solution.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 扫一遍hash表
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target-nums[i])){
                int[] ans = new int[2];
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
