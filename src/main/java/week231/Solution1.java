package week231;

public class Solution1{
    /**
     * 检查二进制字符串
     * 题目链接：https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
     * 此处解法非最优解，是纯脑瘫解法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1"));
    }

    public static boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        boolean tag1 = false;
        boolean tag2 = false;
        for(int i = 0;i< chars.length;i++){
          if(chars[i] == '1' && !tag1) {
              tag1 = true;
              continue;
          }
          if(tag1 && chars[i] == '0') {
              tag2 = true;
              continue;
          }
          if(tag2 && chars[i] == '1'){
              return false;
          }
        }
        return  tag1;

    }
}
