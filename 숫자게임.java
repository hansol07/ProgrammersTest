import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int s = 0 ;
        for (int i = 0; i < A.length; i++) {
            for(int j=s;j<B.length;j++){
              if(arr[j]==1)continue;
                    if(A[i]<B[j]){
                        arr[j]=1;
                        s=j;
                        answer++;
                        break;
                }   
                
               
            }
        }

        return answer;
    }
}
