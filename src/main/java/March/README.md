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
附一个链接： [CSDN博客](https://blog.csdn.net/weixin_30808253/article/details/99587388) 。
另外官方题解也很棒，可以看看官方题解的四种解法。

## 3月4日 俄罗斯套娃信封问题

[题目链接](https://leetcode-cn.com/problems/russian-doll-envelopes/)  

题目难度:`Hard`  

题目标签：`二分查找` `动态规划`  

总结：首先在没有题解的情况下可以认为我今天是无法签到的，这个题哪怕收到了提示，也对我来说有一定的难度（特别是动手上）。    
`排序之后用个数据结构维护一下即可`可以说提示的很明显了，`经典数据结构维护dp`,`dpi表示宽度为i最多为i的能装多少`。    
这里推荐[宫水三叶的题解](https://leetcode-cn.com/problems/russian-doll-envelopes/solution/zui-chang-shang-sheng-zi-xu-lie-bian-xin-6s8d/) .

## 3月5日 用栈实现队列
 
[题目链接](https://leetcode-cn.com/problems/implement-queue-using-stacks/)  

题目难度:`Easy`  

题目标签:`栈` `设计`  

总结：感觉是签到题了，难度并不大。

## 3月6日 下一个更大的元素II

[题目链接](https://leetcode-cn.com/problems/next-greater-element-ii/)  

题目难度:`Medium`  

题目标签:`栈`  

总结：看到标签以后很快想到了，但是依然不可避免的跑偏。应该使用单调栈，搞清楚为什么是单调栈。

## 3月7日 分割回文串

[题目链接](https://leetcode-cn.com/problems/palindrome-partitioning/)  

题目难度：`Medium`  

题目标签: `动态规划` `深度优先搜索` `回溯算法`  

总结：又是不看题解做不出来的一天。很难受，在考虑开新的包给特定算法题，来提高自己的能力了。[参考题解](https://leetcode-cn.com/problems/palindrome-partitioning/solution/wei-sha-yao-zhe-yang-bao-sou-ya-shi-ru-h-41gf/)

## 3月8日 分割回文串II

[题目链接](https://leetcode-cn.com/problems/palindrome-partitioning-ii/)   

题目难度:`Hard`  

题目标签:`动态规划`  

总结：其实在有昨天题解的情况下，今天题难度是被降低了的，从Hard往下掉到了Medium，但是如何处理这个回文数组依然是一个难题，依然需要DP。

## 3月9日 删除字符串中的所有相邻重复项

[题目链接](https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/)  

题目难度:`Easy`  

题目标签：`栈`  

总结：用栈压进压出就行了，知道用栈或者队列的话是非常简单的一道题。但是并没有完，运行结果非常差，虽然可以AC，但是接近垫底。  
从提交记录来大概有三种情况，使用`StringBuilder`，使用原生的`Stack`or`Deque`，使用哨兵。最优情况是使用哨兵。我也将方法放在Solution9里面了。

## 3月10日 基本计算器

[题目链接](https://leetcode-cn.com/problems/basic-calculator/)  

题目难度:`Hard`  

题目标签:`栈`  

总结：我觉得这是学栈必定会遇到的一道题，并且不只是简单的加减情况。无论是学波兰表达式或者其他，这个都属于必定遇到吧？

## 3月11日 基本计算器

[题目链接](https://leetcode-cn.com/problems/basic-calculator-ii/solution/)  

题目难度:`Medium`  

题目标签:`栈`  

总结：这，，基本没什么说的，处理优先级，然后处理一下弹出部分即可。

## 3月12日 

[题目链接](https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/)

题目难度:`Medium`  

题目标签:`栈`  

总结:是用二叉树概念来解决的问题，我可以说并没有非常理解，此题应该重新做。详见[宫水三叶的题解](https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/solution/xiang-xin-ke-xue-xi-lie-xiang-jie-zhi-gu-e3y9/)

## 3月13日 设计哈希集合

[题目链接](https://leetcode-cn.com/problems/design-hashset/)

题目难度：`Easy`  

题目标签:`设计` `HashTable`  

总结：这题最暴力的情况下直接设定大于数据范围的int数组或者boolean数组，便可以直接hash。但是题解采用了更好的办法，详见[宫水三叶的题解](https://leetcode-cn.com/problems/design-hashset/solution/yi-ti-san-jie-jian-dan-shu-zu-lian-biao-nj3dg/)

## 3月14日 设计哈希映射

[题目链接](https://leetcode-cn.com/problems/design-hashmap/)

题目难度：`Easy`  

题目标签:`设计` `HashTable`  

总结：这题与昨天的题很相似，偷懒直接用数据范围数组给过了，但是把链表解法也贴了上去，可以直接看优解。  

## 3月15日 螺旋矩阵

[题目链接](https://leetcode-cn.com/problems/spiral-matrix/)  

题目难度：`Medium`  

题目标签：`数组`

总结：这题基本上直接模拟就可以，但是题解依然提供了很多优秀的思路，其中一种便是划定边界，在划定了边界以后，对于螺旋的处理就非常简单易懂。

## 3月16日 螺旋矩阵II

[题目链接](https://leetcode-cn.com/problems/spiral-matrix-ii/)  

题目难度：`Medium`

题目标签：`数组`

总结：基本同上一道题