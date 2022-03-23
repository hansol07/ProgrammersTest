import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
 List<String> participant1= (List)Arrays.asList(participant).stream().sorted().collect(Collectors.toList());
 List<String> completion1= (List)Arrays.asList(completion).stream().sorted().collect(Collectors.toList());

        int count =participant1.size()-1;
        for(int i = 0 ; i<completion1.size();i++){
            if(!participant1.get(i).equals(completion1.get(i))){
                count = i;
                break;
            }
        }
        answer = participant1.get(count);
        return answer;

    }
}