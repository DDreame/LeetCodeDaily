package week230;

/**
 * 此题未完成
 */
public class Solution3 {

    public static void main(String[] args) {
        int x[] = {3,3,2,4,2,6,2};
        int y[] = {6,2,6,6,1,1,4,6,4,6,2,5,4,2,1};
        System.out.println(minOperations(x,y));
    }

    public static int minOperations(int[] nums1, int[] nums2) {
        int num1Max = nums1.length*6;
        int num1Min = nums1.length;
        int num2Max = nums2.length*6;
        int num2Min = nums2.length;
        if(num1Max < num2Min || num2Max < num1Min){
            return  -1;
        }
        int nums1Sum = 0,nums2Sum = 0;
        int tag[] = new int[6];
        for(int i : nums1) {
            nums1Sum +=i ;
            tag[i-1]++;
        }
        for(int i : nums2) {
            nums2Sum +=i;
            tag[i-1] ++;
        }
        int distance = Math.abs(nums1Sum-nums2Sum);
        int num = -1;
        if(tag[5] < distance /5){
            if(distance %5 == 0) return distance/5;
            return distance/5 +1;
        }else {
            distance = distance-5*tag[5];
            num = tag[5];
        }

        if(tag[4] < distance /4){
            if(distance %4 == 0) return distance/4;
            return distance/4 +1;
        }else {
            distance = distance-4*tag[4];
            num += tag[4];
        }
        if(tag[3] < distance /3){
            if(distance %3 == 0) return distance/3;
            return distance/3 +1;
        }else {
            distance = distance-3*tag[3];
            num += tag[3];
        }
//        if(tag[2] < distance /2){
//            if(distance %2 == 0) return distance/4;
//            return distance/2 +1;
//        }else {
//            distance = distance-2*tag[2];
//            num += tag[2];
//        }
//        num += tag[1];
        return num;
    }
}
