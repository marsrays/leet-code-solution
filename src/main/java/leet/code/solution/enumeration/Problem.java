package leet.code.solution.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum Problem {
    UNKNOWN("UNKNOWN", "", Mode.UNKNOWN),

    TWO_SUM("TwoSum", """
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
            """, Mode.EASY),

    ADD_TWO_NUMBERS("AddTwoNumbers", """
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
            """, Mode.MEDIUM),

    RANGE_SUM_QUERY_IMMUTABLE("RangeSumQueryImmutable", """
Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]
            """, Mode.EASY),

    RANGE_SUM_QUERY_2D_IMMUTABLE("RangeSumQuery2DImmutable", """
Input
["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
[[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
Output
[null, 8, 11, 12]
            """, Mode.MEDIUM);

    private final String value;
    private final String remarks;
    private final Mode mode;

    private static final Map<String, Problem> PROBLEM_MAP = new HashMap<>();

    static {
        for (Problem problem : Problem.values()) {
            if (Problem.UNKNOWN == problem) {
                continue;
            }

            // 所有期號狀態
            PROBLEM_MAP.put(problem.getValue(), problem);
        }
    }

    Problem(String value, String remarks, Mode mode) {
        this.value = value;
        this.remarks = remarks;
        this.mode = mode;
    }

    public String getValue() {
        return this.value;
    }

    public String getRemarks() {
        return remarks;
    }

    public Mode getMode() {
        return mode;
    }

    public static Problem getByValue(String value) {
        return PROBLEM_MAP.getOrDefault(value, Problem.UNKNOWN);
    }
}
