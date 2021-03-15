package week232;

public class Solution4 {

    /**
     * https://leetcode-cn.com/problems/maximum-score-of-a-good-subarray/
     * @param nums
     * @param k
     * @return
     */
    public int maximumScore(int[] nums, int k) {
        int returnNum = 0;
        int[][] min = new int[nums.length][nums.length];
        min[0][0] = nums[0];
        for(int i = 0; i < nums.length; i ++){
            for(int j = i ; j < nums.length; j ++ ){
                if(i == j){
                    min[i][j] = nums[i];
                }else{
                    min[i][j] = Math.min(min[i][j-1],nums[j]);
                }
            }
        }
        int tag = 0;
        for(int i = 0; i <= k ; i ++){
            for(int j = nums.length-1; j >= k; j --){
                int tmp = min[i][j] * (j - i + 1);
                returnNum = Math.max(tmp,returnNum);
            }
        }

        return returnNum;



    }
}
