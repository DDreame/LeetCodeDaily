package March;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution9 {
    public static void main(String[] args) {
        Solution9 s9 = new Solution9();
        System.out.println(s9.removeDuplicates("abbaca"));
    }

    /***
     * 难度：Easy
     * 执行用时：203 ms , 在所有 Java 提交中击败了 13.14% 的用户
     * 内存消耗： 40.1 MB , 在所有 Java 提交中击败了 12.55% 的用户
     */
    public String removeDuplicates(String S) {
        Deque<Character> s = new ArrayDeque<>();
        char[] c = S.toCharArray();
        int num = 0;
        for(int i = 0; i < c.length ; i++ ){
            if(s.isEmpty() || ( s.peekLast() != c[i] )){
                s.addLast(c[i]);
                num++;
            }else if(s.peekLast() == c[i]){
                s.pollLast();
                num--;
            }
        }
        String ans = "";
        for(int i = 0; i < num; i ++){
            ans += s.pollFirst();
        }
        return ans;
    }


    /**
     * 此为此题完美解答
     */
    public String PerfectremoveDuplicates(String S) {
        char[] s = S.toCharArray();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            if (top == -1 || s[top] != s[i]) {
                s[++top] = s[i];
            } else {
                top--;
            }
        }
        return String.valueOf(s, 0, top + 1);
    }
}
