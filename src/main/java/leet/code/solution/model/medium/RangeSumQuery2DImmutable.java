package leet.code.solution.model.medium;

public class RangeSumQuery2DImmutable {
    protected int[][] sum;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        int x = matrix.length+1;
        int y = matrix[0].length+1;
        sum = new int[x][y];
        for (int i = 1; i < y; ++i) {
            int[] temp = new int[x];
            for (int j = 1; j < x; ++j) {
                temp[j] = temp[j-1] + matrix[j-1][i-1] ;
                sum[j][i] = sum[j][i-1] + temp[j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2+1][col2+1] - sum[row2+1][col1] - sum[row1][col2+1] + sum[row1][col1];
    }

    public Integer[] sumRegion(int[] nums) {
        Integer[] results = new Integer[nums.length/4 + 1];
        results[0] = null;
        for (int i = 0; i < nums.length; i += 4) {
            results[i/4 + 1] = sum[nums[i+2]+1][nums[i+3]+1] - sum[nums[i+2]+1][nums[i+1]] - sum[nums[i]][nums[i+3]+1] + sum[nums[i]][nums[i+1]];
        }
        return results;
    }
}
