class Solution {
    public long solution(long n) {
        long answer = 0;
        
    for(int i = 1 ; i<100000;i++){
     
        if(i/n==i%n){
            answer+=i;
           
        }
    }
        return answer;
    }
}
