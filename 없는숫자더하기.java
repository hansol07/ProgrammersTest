import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i =0;i<num.length;i++){
            int count = 0 ; 
            for(int j = 0 ; j<numbers.length;j++){
                if(num[i]==numbers[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                answer += num[i];
            }
        }
        return answer;
    }
}
