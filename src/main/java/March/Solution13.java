package March;

public class Solution13 {


    /***
     *
     * https://leetcode-cn.com/problems/design-hashset/
     * 难度： Easy
     * 执行用时： 17 ms , 在所有 Java 提交中击败了 84.00% 的用户
     * 内存消耗： 45.7 MB , 在所有 Java 提交中击败了 60.50% 的用户
     *
     * 此解法来自三叶  使用了位运算 有效降低了内存
     *


     class MyHashSet {

     int[] bucket = new int[40000];



     public void add(int key) {
     int bucketindex= key/32;
     int bitIndex = key %32;
     setVal(bucketindex,bitIndex,true);
     }

     public void remove(int key) {
     int bucketindex= key/32;
     int bitIndex = key %32;
     setVal(bucketindex,bitIndex,false);
     }


     public boolean contains(int key) {
     int bucketindex= key/32;
     int bitIndex = key %32;
     return getVal(bucketindex,bitIndex);
     }

     private void setVal(int buckIndex,int bitIndex,boolean isAdd){
     if(isAdd){
     int u = (bucket[buckIndex] | 1 << bitIndex);
     bucket[buckIndex] = u;
     }else{
     int u = (bucket[buckIndex] & ~(1 << bitIndex));
     bucket[buckIndex] = u;
     }
     }

     private boolean getVal(int buckIndex,int bitIndex){
     int u = (bucket[buckIndex] >> bitIndex) & 1;
     return u == 1;
     }
     }


     *
     *
     *
     *
     */
}
