# 三月每日签到题板块

## 总结




## 3月1日 区域和检索 - 数组不可变

[题目链接](https://leetcode-cn.com/problems/range-sum-query-immutable/)  

题目难度：`Easy`

题目标签：`动态规划`

总结：Easy题确实是真的Easy题，我看到以后直接定义全局数组然后每次for循环计算从i到j就完了。事后看题解才知道是一个前缀和的裸题。  
有一个题解是从暴力到前缀和思路的递推，相当不错。

## 3月2日 二维区域和检索 - 矩阵不可变

[题目链接](https://leetcode-cn.com/problems/range-sum-query-2d-immutable/submissions/)  

题目难度：`Medium`  

题目标签: `动态规划` 

总结：是昨天题目的进阶版本，测试用例依然在可以暴力的范围之内，所以先用暴力提交了一遍。  
使用昨天的前缀和题解进行自行思考，基本上达到了最优的解的情况，难点一是前缀和数组的制作，难点二是计算的时候重复扣掉的值需要加回来。除此外没有其他难点。  
可以考虑使用面积覆盖来进行思索。属于Medium中的Easy题了。


## 3月3日 比特位计数

[题目链接](https://leetcode-cn.com/problems/counting-bits/)  

题目难度：`Medium`  

题目标签:`位运算` `动态规划`  

总结：对于位运算的思路还是很差劲，想到了逐位去计算1的数量，但是委实太笨，不想下手。受人提醒后百度搜索了`poptcount`，才在CSDN的帮助下完成了这个答案。
附一个链接：[CSDN博客](https://blog.csdn.net/weixin_30808253/article/details/99587388)。
另外官方题解也很棒，可以看看官方题解的四种解法。
