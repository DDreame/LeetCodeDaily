package March;

/**
 * @author 梦某人
 * @date 2021/3/16 18:06
 */
public class Solution16 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int up = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;
        int tag = 1;
        while(tag <= n*n){
            for(int col = left ; col <= right; col ++){
                ans[up][col] = tag;
                tag++;
            }
            if(++up > down) break;
            for(int row = up ; row <= down; row ++){
                ans[row][right] = tag;
                tag++;
            }
            if(--right < left) break;
            for(int col = right ; col >= left ; col --){
                ans[down][col] = tag;
                tag ++;
            }
            if(--down < up) break;
            for(int row = down ; row >= up ; row --){
                ans[row][left] = tag;
                tag++;
            }
            if(++left > right) break;
        }
        return ans;
    }
}
