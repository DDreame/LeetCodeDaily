package March;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution10 {


    public int calculate(String s) {
        // 存放所有的数字
        Deque<Integer> nums = new ArrayDeque<>();
        // 为了防止第一个数为负数，先往 nums 加个 0
        nums.addLast(0);
        // 将所有的空格去掉，并将 (- 替换为 (0-
        s = s.replaceAll(" ", "");
        s = s.replaceAll("\\(-", "(0-");
        // 存放所有的操作，包括 +/-
        Deque<Character> ops = new ArrayDeque<>();
        int n = s.length();
        char[] cs = s.toCharArray();
        for (int i = 0; i < n; i++) {
            char c = cs[i];
            if (c == '(') {
                ops.addLast(c);
            } else if (c == ')') {
                // 计算到最近一个左括号为止
                while (!ops.isEmpty()) {
                    char op = ops.peekLast();
                    if (op != '(') {
                        calc(nums, ops);
                    } else {
                        ops.pollLast();
                        break;
                    }
                }
            } else {
                if (isNum(c)) {
                    int u = 0;
                    int j = i;
                    // 将从 i 位置开始后面的连续数字整体取出，加入 nums
                    while (j < n && isNum(cs[j])) u = u * 10 + (int)(cs[j++] - '0');
                    nums.addLast(u);
                    i = j - 1;
                } else {
                    // 有一个新操作要入栈时，先把栈内可以算的都算了
                    while (!ops.isEmpty() && ops.peekLast() != '(') calc(nums, ops);
                    ops.addLast(c);
                }
            }
        }
        while (!ops.isEmpty()) calc(nums, ops);
        return nums.peekLast();
    }
    void calc(Deque<Integer> nums, Deque<Character> ops) {
        if (nums.isEmpty() || nums.size() < 2) return;
        if (ops.isEmpty()) return;
        int b = nums.pollLast(), a = nums.pollLast();
        char op = ops.pollLast();
        nums.addLast(op == '+' ? a + b : a - b);
    }
    boolean isNum(char c) {
        return Character.isDigit(c);
    }



}
