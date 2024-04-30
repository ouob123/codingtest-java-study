//Day17
//숫자 찾기
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String strnum = String.valueOf(num);
        
        String[] array = strnum.split("");
        
        for (int i=0; i<array.length; i++){
            if (Integer.parseInt(array[i])== k){
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
                
        }
        return answer;
    }
}
//n의 배수 고르기
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<numlist.length; i++){
            if (numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }
        
        answer = new int[list.size()];
        
        for (int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}
//자릿수 더하기
class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0){
            answer += (n % 10);
            n = n / 10;
        }
        return answer;
    }
}

//OX퀴즈
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        //퀴즈를 하나씩 꺼내고 하나를 공백 기준으로 스플릿하기
        for (int i=0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            
            int X = Integer.parseInt(str[0]);
            int Y = Integer.parseInt(str[2]);
            int Z = Integer.parseInt(str[4]);
            
            int result = 0;
            
            if (str[1].equals("+")){
                // 더하기이면
                result = X + Y;
                
                if (result == Z){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
                
                
            } else {
                // 빼기이면
                result = X-Y;
                if (result == Z){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
                
            }
        }
        
        return answer;
    }
}
