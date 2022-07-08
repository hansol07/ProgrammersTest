import java.util.*;
class Solution {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        Arrays.sort(budgets);  // 예산을 오름차순 정렬함
        int count = 0 ;        // 통과된 예산의 수
        int num = budgets.length;  //지방의 수
        if(budgets[0]>= M/num){  // 첫예산도 통과가 안되는 경우
            answer=M/num;
        }else{          
            for(int i=0;i<budgets.length-1;i++){
            count++;
            M-=budgets[i];
            if( (M/(num-count)) > budgets[i+1]){     //(남은 예산/남은지방수) 가 다음 지방 예산보다 크면 통과
                 answer=budgets[i+1];
            }else{      
              answer=M/(num-count);
              break;
            }
        }
        }

        return answer;
    }
}
