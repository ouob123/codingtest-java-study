//Day16
//편지
class Solution {
    public int solution(String message) {
        int answer = 0;
        answer = message.length()*2;
        return answer;
    }
}

//가장 큰 수 찾기
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}

//문자열 계산하기
import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> operation = new ArrayList<>();
        
        //연산자, 숫자로 분리
        for (int i=0; i<array.length; i++){
            if (array[i].equals("+") || array[i].equals("-")){
                operation.add(array[i]);
            } else {
                num.add(Integer.parseInt(array[i]));
            }
        }
        
        //연산하기
        answer = num.get(0);
        
        for (int i=1; i<num.size(); i++){
            if (operation.get(i-1).equals("+")){
                // 더하기
                answer += num.get(i);
            } else {
                // 빼기
                answer -= num.get(i);
            }
        }
        
        return answer;
    }
}

//배열의 유사도
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i=0; i<s1.length; i++){
            for (int j=0; j<s2.length; j++){
                if (s1[i].equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}
