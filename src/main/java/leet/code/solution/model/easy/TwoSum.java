package leet.code.solution.model.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] answer(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i<nums.length;++i){
            if (null == map.get(target - nums[i])){
                map.put(nums[i], i);
            } else {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                break;
            }

        }
        return ans;
    }
}
