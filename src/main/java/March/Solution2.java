package March;

public class Solution2 {
    /***
     *
     *  暴力解题不具有技术含量结果非常差
     *
    int[][] nums;

    public static void main(String[] args) {
        int[][] nums = new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        System.out.println(sumRegion(2,1,4,3,nums));
        System.out.println(sumRegion(1,1,2,2,nums));
    }
    public static int sumRegion(int row1, int col1, int row2, int col2,int[][] nums) {
        int tag = 0;
        int tmp = col1;
        for(;row1 <=row2;row1++){
            for(; col1 <=col2 ; col1++){
                tag += nums[row1][col1];
            }
            col1 = tmp;
        }
        return tag;
    }
    **/

    /**
     *
     *
     * 算是标准题解了，根据昨天前缀和的题解思路进行思考的
     * 难点是计算的时候到底如何确定下表，前缀和数组把握思路很容易思考，但是要返回确定值的时候需要考虑清楚减去的区域。
     *
     class NumMatrix {
        int[][] nums;
        public NumMatrix(int[][] matrix) {
            if(matrix.length >0){
                this.nums = new int[matrix.length+1][matrix[0].length+1];
                for(int i = 1; i< nums.length; i++){
                    for(int j = 1; j< nums[0].length; j++ ){
                        nums[i][j] = nums[i][j-1] + nums[i-1][j] + matrix[i-1][j-1] - nums[i-1][j-1];
                    }
                }
            }
         }

         public int sumRegion(int row1, int col1, int row2, int col2) {
            return nums[row2+1][col2+1] - nums[row1][col2+1] - nums[row2+1][col1] + nums[row1][col1];
         }
         }
     **/





}
