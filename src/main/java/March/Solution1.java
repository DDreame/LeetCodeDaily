package March;

public class Solution1 {

    /**
     * https://leetcode-cn.com/problems/range-sum-query-immutable/
     *  区域和检索 - 数组不可变
     *  Difficult ：Easy
     *
     *
     * My Answer
     * class NumArray {
     *
     *     int[] nums;
     *
     *     public NumArray(int[] nums) {
     *         this.nums = nums;
     *     }
     *
     *     public int sumRange(int i, int j) {
     *         int tag = 0;
     *         for(int x = i; i <= j ; i++){
     *             tag += nums[i];
     *         }
     *         return tag;
     *     }
     * }
     *
     *
     * Writer up
     *
     * class NumArray {
     *     int[] sums;
     *
     *     public NumArray(int[] nums) {
     *         int n = nums.length;
     *         sums = new int[n + 1];
     *         for (int i = 0; i < n; i++) {
     *             sums[i + 1] = sums[i] + nums[i];
     *         }
     *     }
     *
     *     public int sumRange(int i, int j) {
     *         return sums[j + 1] - sums[i];
     *     }
     * }
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/range-sum-query-immutable/solution/qu-yu-he-jian-suo-shu-zu-bu-ke-bian-by-l-px41/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     *
     */



}
