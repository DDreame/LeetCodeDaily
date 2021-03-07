package week231;

public class Solution2 {

    /**
     * 构成特定和需要添加的最少元素
     * 题目链接：https://leetcode-cn.com/problems/minimum-elements-to-add-to-form-a-given-sum/
     * tips: 向上取整：（j + k - 1 ) / k
     * @param args
     */
    public static void main(String[] args) {

    }



    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int x : nums){
            sum += x;
        }
        long distance = goal - sum;
        long num =  Math.abs(distance) / limit;
        if(Math.abs(distance) % limit != 0){
            num +=1;
        }
        return (int) num;

    }

}
