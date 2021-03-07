package March;

import java.util.ArrayList;
import java.util.List;

public class Solution7 {

    /**
     * 可以Debug一下感受一下情况。
     * @param args
     */
    public static void main(String[] args) {
        String s = "abcdedcbaba";
        Solution7 s7 = new Solution7();
        System.out.println(s7.partition(s));
    }

    /**
     * 难度：Medium
     * 执行用时：12 ms , 在所有 Java 提交中击败了 46.75% 的用户
     * 内存消耗： 51.7 MB , 在所有 Java 提交中击败了 77.04% 的用户
     */
    public List<List<String>> partition(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        boolean[][] f = new boolean[n][n];
        for(int j = 0;j < n; j++){
            for(int i = j; i >= 0 ; i --){
                if(i == j){
                    f[i][j] = true;
                }else if(j - i + 1 == 2){
                    f[i][j] = chars[i] == chars[j];
                }else {
                    f[i][j] = chars[i] == chars[j] && f[i+1][j-1];
                }
            }
        }

        List<List<String>> ans = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        dfs(cur,ans,f,s,0);
        return ans;
    }

    void dfs(List<String> cur,List<List<String>> ans,boolean[][] f,String s,int u){
        int n = s.length();
        if(u == n) ans.add(new ArrayList<>(cur));
        for(int i = u;i < n ; i++){
            if(f[u][i]){
                cur.add(s.substring(u,i+1));
                dfs(cur,ans,f,s,i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
}
