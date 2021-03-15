package March;

public class Solution14 {
    /**
     *
     *
     * 链接：https://leetcode-cn.com/problems/design-hashmap/
     * 题目难度：Easy
     * 执行用时： 51 ms , 在所有 Java 提交中击败了 17.00% 的用户
     * 内存消耗： 46.2 MB , 在所有 Java 提交中击败了 17.00% 的用户
     *
     * class MyHashMap {
     *
     *     int x[] = new int[1000001];
     *     public MyHashMap() {
     *         Arrays.fill(x,-1);
     *     }
     *
     *     public void put(int key, int value) {
     *         x[key] = value;
     *     }
     *
     *     public int get(int key) {
     *         return x[key];
     *     }
     *
     *
     *     public void remove(int key) {
     *         x[key] = -1;
     *     }
     * }
     *
     *
     *
     *
     * 作者：AC_OIer
     * 链接：https://leetcode-cn.com/problems/design-hashmap/solution/yi-ti-shuang-jie-jian-dan-shu-zu-lian-bi-yhiw/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * class MyHashMap {
     *     static class Node {
     *         int key, value;
     *         Node next;
     *         Node(int _key, int _value) {
     *             key = _key;
     *             value = _value;
     *         }
     *     }
     *
     *     // 由于使用的是「链表」，这个值可以取得很小
     *     Node[] nodes = new Node[10009];
     *
     *     public void put(int key, int value) {
     *         // 根据 key 获取哈希桶的位置
     *         int idx = getIndex(key);
     *         // 判断链表中是否已经存在
     *         Node loc = nodes[idx], tmp = loc;
     *         if (loc != null) {
     *             Node prev = null;
     *             while (tmp != null) {
     *                 if (tmp.key == key) {
     *                     tmp.value = value;
     *                     return;
     *                 }
     *                 prev = tmp;
     *                 tmp = tmp.next;
     *             }
     *             tmp = prev;
     *         }
     *         Node node = new Node(key, value);
     *
     *         // 头插法
     *         // node.next = loc;
     *         // nodes[idx] = node;
     *
     *         // 尾插法
     *         if (tmp != null) {
     *             tmp.next = node;
     *         } else {
     *             nodes[idx] = node;
     *         }
     *     }
     *
     *     public void remove(int key) {
     *         int idx = getIndex(key);
     *         Node loc = nodes[idx];
     *         if (loc != null) {
     *             Node prev = null;
     *             while (loc != null) {
     *                 if (loc.key == key) {
     *                     if (prev != null) {
     *                         prev.next = loc.next;
     *                     } else {
     *                         nodes[idx] = loc.next;
     *                     }
     *                     return;
     *                 }
     *                 prev = loc;
     *                 loc = loc.next;
     *             }
     *         }
     *     }
     *
     *     public int get(int key) {
     *         int idx = getIndex(key);
     *         Node loc = nodes[idx];
     *         if (loc != null) {
     *             while (loc != null) {
     *                 if (loc.key == key) {
     *                     return loc.value;
     *                 }
     *                 loc = loc.next;
     *             }
     *         }
     *         return -1;
     *     }
     *
     *     int getIndex(int key) {
     *         // 因为 nodes 的长度只有 10009，对应的十进制的 10011100011001（总长度为 32 位，其余高位都是 0）
     *         // 为了让 key 对应的 hash 高位也参与运算，这里对 hashCode 进行右移异或
     *         // 使得 hashCode 的高位随机性和低位随机性都能体现在低 16 位中
     *         int hash = Integer.hashCode(key);
     *         hash ^= (hash >>> 16);
     *         return hash % nodes.length;
     *     }
     * }

     */
}
