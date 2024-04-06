//Day14
//가까운 수
import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        //차이가 가장 작은 수
        int min = 100;
        
        //차이가 가장 작은 어레이의 값
        int min_array = 0;
        
        //정렬을 해서 처음 수가 가장 작은 거로...
        Arrays.sort(array);
        
        //for 문 돌면서 절댓값 비교, 작으면 업데이트, array의 값도 업데이트
        for (int i=0; i<array.length; i++){
            if (Math.abs(array[i] - n) < min){
                min = Math.abs(array[i] - n);
                min_array = array[i];
            }
        
        }
        answer = min_array;
        return answer;
    }
}
//369게임
class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        char[] array = str.toCharArray();
        
        for (char ch : array){
            if (ch == '3' || ch == '6' || ch== '9'){
                answer++;
            }
        }
        return answer;
    }
}
//암호 해독
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i=code-1; i<cipher.length(); i += code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}

//대문자와 소문자
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        
        for (char ch : array){
            if (ch >= 'a' && ch <= 'z'){
                answer += (char)(ch - 32);
            } else {
                answer += (char)(ch + 32);
            }
        }
        return answer;
    }
}
