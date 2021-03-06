package March;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution6 {

    /**
     *
     * 下一个更大元素 II
     * 难度：Medium
     * 执行用时： 8 ms , 在所有 Java 提交中击败了 85.75% 的用户  O(n)
     * 内存消耗： 40 MB , 在所有 Java 提交中击败了 77.40% 的用户 O(n)
     *
     *
     * 一开始是毫无思路的，但是看到标签以后很快想明白了用压栈的方式来保存暂时没修改的内容从而提高速度
     * 但是居然脑袋一抽去存放当前值，其实真的是大可不必了。
     * 绕了很久没处理过来如何处理循环，甚至没考虑清楚会不会循环两次以上，委实不应该。
     */


    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> d = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i = 1 ; i < n*2;i++){

            while (!d.isEmpty() && nums[i % n] > nums[d.peekLast()]) {
                int u = d.pollLast();
                ans[u] = nums[i % n];
            }
            d.addLast(i % n);

        }

        return ans;




    }

}
