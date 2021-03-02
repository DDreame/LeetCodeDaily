package week230;

public class Solution2 {


    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int num = 9999;

        //得分表 越接近于0越优秀
        int score[] = new int[baseCosts.length];

        //添加基料
        for(int i =0 ;i< baseCosts.length;i++){
            score[i] = baseCosts[i]-target;
            if(score[i] < num){
                num = score[i];
            }
            if(score[i] == 0) return target;
        }

        //添加配料
        for(int i =0 ;i< baseCosts.length;i++){
            int tmp = score[i];
            for(int j :toppingCosts){
                tmp += j;
                if(tmp == 0) return  target;
                if(Math.abs(tmp) < Math.abs(score[i])) score[i] = tmp;
                if(tmp < 0) {
                    tmp += j;
                    if (tmp == 0) return target;
                    if (Math.abs(tmp) < Math.abs(score[i])) score[i] = tmp;
                }
            }
        }

        //最后比一轮
        for(int i = 0;i < score.length;i++){
            if(score[i] < num){
                num = score[i];
            }
        }

        return target+num;
    }
}
