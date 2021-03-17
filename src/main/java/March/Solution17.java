package March;

/**
 * @author 梦某人
 * @date 2021/3/17 16:08
 */
public class Solution17 {

    /**
     *   作者：AC_OIer
     *     链接：https://leetcode-cn.com/problems/distinct-subsequences/solution/xiang-jie-zi-fu-chuan-pi-pei-wen-ti-de-t-wdtk/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param s
     * @param t
     * @return
     */

    public int numDistinct(String s, String t) {
        // 技巧：往原字符头部插入空格，这样得到 char 数组是从 1 开始
        // 同时由于往头部插入相同的（不存在的）字符，不会对结果造成影响，而且可以使得 f[i][0] = 1，可以将 1 这个结果滚动下去
        int n = s.length(), m = t.length();
        s = " " + s;
        t = " " + t;
        char[] cs = s.toCharArray(), ct = t.toCharArray();
        // f(i,j) 代表考虑「s 中的下标为 0~i 字符」和「t 中下标为 0~j 字符」是否匹配
        int[][] f = new int[n + 1][m + 1];
        // 原字符只有小写字符，当往两个字符插入空格之后，f[i][0] = 1 是一个显而易见的初始化条件
        for (int i = 0; i < n; i++) f[i][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 包含两种决策：
                // 不使用 cs[i] 进行匹配，则有 f[i][j] = f[i - 1][j]
                f[i][j] = f[i - 1][j];
                // 使用 cs[i] 进行匹配，则要求 cs[i] == ct[j]，然后有  f[i][j] += f[i - 1][j - 1]
                if (cs[i] == ct[j]) {
                    f[i][j] += f[i - 1][j - 1];
                }
            }
        }
        return f[n][m];
    }


}
