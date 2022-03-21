
class Solution {
    public int rank(int same){
       int rank = 0;
        switch(same){
            case 0 : rank = 6; 
            break;
            case 1 : rank = 6; 
            break;
            case 2 : rank = 5; 
            break;
            case 3 : rank = 4; 
            break;
            case 4 : rank = 3; 
            break;
            case 5 : rank = 2; 
            break;
            case 6 : rank = 1; 
            break;
            default : rank = 0;
            break;
        }

        return rank;
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int high = 0;
        int low = 0;
        int[] answer = {0,0};
        int sameCount = 0;
        int zeroCount = 0;
        for(int i = 0 ; i<lottos.length;i++){
            if(lottos[i] == 0)
                zeroCount++;
        }
        for(int i = 0 ; i<lottos.length ; i++){
            for(int j =0 ; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    sameCount++;
        }
        }
        low = sameCount;
        high = sameCount + zeroCount;
        int lowRank = rank(low);
        int highRank = rank(high);
        answer[1]= lowRank;
        answer[0] = highRank;
        return answer;
    }
}