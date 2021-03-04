package March;

import java.util.Arrays;

class Solution4 {
    /**
     * 本解法并非最优解，而且也非我直接想出来的，猫神和Leetcode宫水三叶题解而来。
     * @param envelopes
     * @return
     */
    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;
        if(n == 0) return 0;
        Arrays.sort(envelopes,(a, b)-> a[0]-b[0]);
        int f[] = new int[n];
        int ans = 1;
        for(int i = 0; i < n; i++){
            f[i] = 1;
            for(int j = i-1 ; j >= 0; j--){
                if(check(envelopes,j,i)){
                    f[i] = Math.max(f[i],f[j]+1);
                }
            }
            ans = Math.max(f[i],ans);
        }
        return ans;

    }
    private boolean check(int[][] envelopes,int mid,int i){
        return envelopes[mid][0] < envelopes[i][0] && envelopes[mid][1] < envelopes[i][1];
    }





}
