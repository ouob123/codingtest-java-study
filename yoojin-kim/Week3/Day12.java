// 모음 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer += ch;
            }
        }
        return answer;
    }
}

// 문자열 정렬하기 (1)
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            // 숫자인 경우만 새로운 리스트에 추가
            if (arr[i].matches("\\d")) { // 현재 문자가 숫자인지 확인
                numbers.add(Integer.parseInt(arr[i]));
            }
        }
        
        // 리스트 정렬
        Collections.sort(numbers);
        
        // 리스트를 int 배열로 변환
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }        
        return answer;
    }
}

// 숨어있는 숫자의 덧셈 (1)
// 풀이 참조
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 문자열 순회
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            // 숫자인 경우
            if (Character.isDigit(ch)) {
                // char 형태의 숫자를 정수로 변환하여 더하기
                answer += ch - '0';
            }
        }
        return answer;
    }
}

// 소인수분해
import java.util.ArrayList;

// 풀이 참조 - 소인수 중복
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>(); // 소인수를 저장할 리스트

        for (int i = 2; i <= n; i++) {
            // n이 i로 처음 나누어질 때만 리스트에 추가
            if (n % i == 0) {
                list.add(i);
                // n을 i로 나눌 수 있는 만큼 나누기
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        // 결과를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
