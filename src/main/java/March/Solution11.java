package March;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution11 {
        public int calculate(String s) {
            Map<Character, Integer> map = new HashMap<Character, Integer>(){{
                put('-', 1);
                put('+', 1);
                put('*', 2);
                put('/', 2);
                put('%', 2);
                put('^', 3);
            }};

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
                        // 只有满足「栈内运算符」比「当前运算符」优先级高/同等，才进行运算
                        while (!ops.isEmpty() && ops.peekLast() != '(') {
                            char prev = ops.peekLast();
                            if (map.get(prev) >= map.get(c)) {
                                calc(nums, ops);
                            } else {
                                break;
                            }
                        }
                        ops.addLast(c);
                    }
                }
            }
            while (!ops.isEmpty()) {
                calc(nums, ops);
            }
            return nums.peekLast();
        }
        void calc(Deque<Integer> nums, Deque<Character> ops) {
            if (nums.isEmpty() || nums.size() < 2) {
                return;
            }
            if (ops.isEmpty()) {
                return;
            }
            int b = nums.pollLast(), a = nums.pollLast();
            char op = ops.pollLast();
            switch (op){
                case '+':  nums.addLast(a+b); break;
                case '-':  nums.addLast(a-b); break;
                case '*':  nums.addLast(a*b); break;
                case '/':  nums.addLast(a/b); break;
                default:
                    throw new IllegalStateException("Unexpected value: " + op);
            }

        }
        boolean isNum(char c) {
            return Character.isDigit(c);
        }

}
