package March;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5 {
    /**
     * 本题难度Easy 基本很容易想到倒腾的办法
     * 可以说学习了Java的栈操作。
     * 执行用时：0 ms , 在所有 Java 提交中击败了 100.00% 的用户
     * 内存消耗： 36.4 MB , 在所有 Java 提交中击败了 51.21% 的用户
     */

    Deque<Integer> in,out;
    /** Initialize your data structure here. */
    public Solution5() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.addLast(in.pollLast());
            }
        }
        return out.pollLast();
    }

    /** Get the front element. */
    public int peek() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.addLast(in.pollLast());
            }
        }
        return out.peekLast();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
