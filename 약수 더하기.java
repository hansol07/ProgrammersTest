class Solution {
    public int calNum(int num){
        int count = 0 ;
        for(int i = num ; i>=1 ; i--){
        if(num % i == 0)
            count++;
        }
        if(count % 2 == 0){
            return num;
        }else{
            return 0-num;
        }
    }
    public int solution(int left, int right) {
        int count = right - left +1;
        int[] num = new int[count];
        for(int i = 0 ; i<num.length ; i++){
            num[i] = left+i;
        }
        int[] calculNum = new int[count];
        for(int i = 0; i<calculNum.length ; i++){
            calculNum[i] = calNum(num[i]);
        }
        int answer = 0;
        for(int i=0 ; i<num.length ; i++){
            answer += calculNum[i];
        }
        return answer;
    }
}