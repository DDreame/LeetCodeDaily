package March;

public class Solution8 {

    public static void main(String[] args) {
        Solution8  s8 = new Solution8();
        String s = "cabababcbc";
        System.out.println(s8.minCut(s));
    }
    public int minCut(String s) {
        int l = s.length();
        char[] chars = s.toCharArray();
        boolean[][] f = new boolean[l][l];
        int[] n = new int[l];
        int min = l-1;
        for(int j = 0; j < l ; j++){
            for(int i = j; i >= 0 ; i--){
                if(i == j ){
                    f[i][j] = true;
                }else if(j - i + 1 == 2){
                    f[i][j] = chars[i] == chars[j];
                }else{
                    f[i][j] = chars[i] == chars[j] && f[i+1][j-1];
                }

            }
        }
        for(int j = 1; j < l ; j ++){
            if(f[0][j]){
                n[j] = 0;
            }else {
                n[j] = n[j-1] +1;

                for(int i = 0; i < j ; i ++){
                    if(f[i][j]){
                        n[j] = Math.min(n[j],n[i-1] +1);
                    }
                }
            }
        }
        return n[l-1];
    }




}
