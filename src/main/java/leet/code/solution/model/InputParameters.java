package leet.code.solution.model;

public class InputParameters {
    int[] nums;
    int target;
    int[] targets;
    int[][] matrix2d;

    public int[] getNums() {
        return nums.clone();
    }

    public void setNums(int[] nums) {
        this.nums = nums.clone();
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int[] getTargets() {
        return targets.clone();
    }

    public void setTargets(int[] targets) {
        this.targets = targets.clone();
    }

    public int[][] getMatrix2d() {
        return matrix2d.clone();
    }

    public void setMatrix2d(int[][] matrix2d) {
        this.matrix2d = matrix2d.clone();
    }
}
