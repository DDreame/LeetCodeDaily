package week232;

public class Solution2 {
    /**
     https://leetcode-cn.com/problems/find-center-of-star-graph/
     */
    public int findCenter(int[][] edges) {
        int[] x = new int[100001];
        for(int i = 0; i < edges.length; i++){
            x[edges[i][0]]++;
            x[edges[i][1]]++;
        }
        int tag = -1;
        int max = -1;
        for(int i = 0; i < x.length; i ++){
            if(max < x[i]){
                tag = i;
                max = x[i];
            }
        }
        return tag;

    }

}
