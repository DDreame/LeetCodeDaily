package week1;

public class Solution2 {


    public static void main(String[] args) {
        String boxes = "001011";
        int[] x = minOperations(boxes);
        for (int i : x){
            System.out.println(i);
        }

    }
    public static int[] minOperations(String boxes) {
        char[] x = boxes.toCharArray();
        int[] y = new int[x.length];
        for(int i = 0; i<x.length;i++){
            if(x[i] == '1'){
                for(int j = 0; j< x.length; j++){
                    y[j] += Math.abs(i-j);
                }
            }
        }

        return y;
    }
}
