//Day18
//문자열안에 문자열
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
//제곱수 판별하기
class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for (int i=1; i<= n/2;  i++){
            if (i*i == n){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
//세균 증식
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i=0; i<t; i++){
            answer = answer * 2;
        }
        return answer;
    }
}
//문자열 정렬하기 (2)
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String smallstr = my_string.toLowerCase();
        String[] array = smallstr.split("");
        
        Arrays.sort(array);
        
        for (String s : array){
            answer += s;
        }
        
        return answer;
    }
}
