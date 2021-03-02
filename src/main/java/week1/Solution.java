package week1;

class Solution {

    public static void main(String[] args) {
        String word1 = "abcedf";
        String word2 = "pqrwtmn";
        System.out.println(mergeAlternately(word1,word2));
        System.out.println("-----");
    }

    public static  String mergeAlternately(String word1, String word2) {
        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        char[] three = new char[one.length+two.length];
        int tag = 0;
        for(int i = 0;i<one.length;i++){
            if(i < two.length){
                three[i+tag] = one[i];
                tag++;
                three[i+tag] = two[i];
                continue;
            }
            three[i+tag] = one[i];

        }
        for(int i = one.length; i< two.length;i++){
            three[i+tag] = two[i];
        }
        return String.valueOf(three);
    }
}