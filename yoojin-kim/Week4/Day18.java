// 문자열안에 문자열
// 중간부터 풀이 참조
class Solution {
    public int solution(String str1, String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            // str2가 str1에 일치하는지 여부를 추적
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    // 일치하지 않으면 반복을 중단하고 다음 위치로 이동
                    match = false;
                    break;
                }
            }
            if (match) {
                return 1;
            }
        }
        return 2;
    }
}

// 제곱수 판별하기
class Solution {
    public int solution(int n) {
        for(int i = 1; i*i <= n; i++) {
            if(i * i == n){
                return 1;
            }
        }
        return 2;
    }
}

// 세균 증식
class Solution {
    public int solution(int n, int t) {
        return (int) (n * Math.pow(2, t));
    }
}

// 문자열 정렬하기 (2)
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String myStringLowerCase = my_string.toLowerCase();
        
        // 문자열을 문자 배열로 변환
        char[] myStringChars = myStringLowerCase.toCharArray();
        // 배열 정렬
        Arrays.sort(myStringChars);
        // 정렬된 배열을 다시 문자열로 변환
        String answer = new String(myStringChars);
        
        return answer;
    }
}
