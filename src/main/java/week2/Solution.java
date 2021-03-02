package week2;

import java.util.List;

public class Solution {


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int tag = -1;
        if(ruleKey.equals("type")){
            tag = 0;
        }else  if( ruleKey.equals("color")){
            tag = 1;
        }else {
            tag = 2;
        }

        int num = 0;
        for(List<String> item : items){
            if(ruleValue.equals(item.get(tag))){
                num++;
            }
        }


        return  num;

    }
}
