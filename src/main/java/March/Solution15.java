package March;

import java.util.ArrayList;
import java.util.List;

class Solution15 {


    /**
     * 链接：https://leetcode-cn.com/problems/spiral-matrix/
     * 题目难度：Medium
     * 执行用时： 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
     * 内存消耗： 36.6 MB , 在所有 Java 提交中击败了 65.77% 的用户
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {

        int up = 0;
        int down = matrix.length-1;
        int right = matrix[0].length - 1;
        int left = 0;
        List<Integer> ans = new ArrayList<>();

        while(true){
            for(int col = left; col <= right; col ++ ){
                ans.add(matrix[up][col]);
            }
            if(++up > down) break;
            for(int row = up; row <= down ; row ++){
                ans.add(matrix[row][right]);
            }
            if(--right < left) break;
            for(int col = right; col >= left ; col --){
                ans.add(matrix[down][col]);
            }
            if(--down < up) break;
            for(int row = down; row >= up ; row --){
                ans.add(matrix[row][left]);
            }
            if(++left > right) break;
        }
        return ans;
    }
}