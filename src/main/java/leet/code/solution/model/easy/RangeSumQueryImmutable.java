package leet.code.solution.model.easy;

public class RangeSumQueryImmutable {
    private int[] sum;

    public RangeSumQueryImmutable(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public Integer[] sumRange(int[] nums) {
        Integer[] results = new Integer[nums.length/2 + 1];
        results[0] = null;
        for (int i = 0; i < nums.length; i += 2) {
            results[i/2 + 1] = sum[nums[i+1] + 1] - sum[nums[i]];
        }
        return results;
    }
}
