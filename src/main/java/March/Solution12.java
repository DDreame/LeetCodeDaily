package March;

public class Solution12 {

    /***
     *
     * 难度： Medium
     * 执行用时： 4 ms , 在所有 Java 提交中击败了 77.00% 的用户
     * 内存消耗： 38.4 MB , 在所有 Java 提交中击败了 60.50% 的用户
     */
    public boolean isValidSerialization(String s) {
        String[] ss = s.split(",");
        int n = ss.length;
        int in = 0, out = 0;
        for (int i = 0; i < n; i++) {
            if (!ss[i].equals("#")) out += 2;
            if (i != 0) in++;
            if (i != n - 1 && out <= in) return false;
        }
        return in == out;
    }
}
