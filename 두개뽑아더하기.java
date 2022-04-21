import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
   
        List<Integer> arr  = new ArrayList<>();
             List<Integer> arr2  = new ArrayList<>();
        for (int i =0; i<numbers.length-1;i++){
            for(int j = i+1 ;j<numbers.length;j++){
                arr.add(numbers[i]+numbers[j]);
            }
            
        }
       arr.stream().distinct().collect(Collectors.toList());
        int[] answer = new int[arr.size()];
        for(int i =0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
            Arrays.sort(answer);


        return answer;
        
    }
}
