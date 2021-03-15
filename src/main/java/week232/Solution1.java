package week232;

public class Solution1 {

    /**
     * https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal/
     */
    public boolean areAlmostEqual(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char tmp1 = '0';
        char tmp2 = '0';
        boolean tag = false;
        for(int i = 0;i < c1.length; i++){
            if(c1[i] != c2[i]){
                if(tmp1 == '0'){
                    tmp1 = c1[i];
                    tmp2 = c2[i];
                }else if(!tag){
                    if(tmp1 != c2[i] || tmp2 != c1[i] ) return false;
                    tag = true;
                }else{
                    return false;
                }
            }
            if(tmp1 != '0' && i == c1.length-1 && !tag) return false;

        }
        return true;

    }
}
