// 숫자 찾기
// 나중에 다시 풀어보기
class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        
        // numStr의 각 자리수를 순회
        for (int i = 0; i < numStr.length(); i++) {
            // 현재 자리의 문자를 숫자로 변환
            int currentNum = Character.getNumericValue(numStr.charAt(i));
            
            // 변환된 숫자와 k를 비교
            if (currentNum == k) {
                // 1부터 시작하는 실제 자리수를 계산하기 위해 i에 1을 더함
                return i + 1;
            }
        }       
        // k와 동일한 숫자를 찾지 못한 경우 -1을 반환
        return -1;
    }
}

// n의 배수 고르기
// 풀이 참조
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // n의 배수인 숫자들을 저장할 임시 리스트 생성
        ArrayList<Integer> tempList = new ArrayList<>();

        // numlist 배열을 순회하며 n의 배수만을 tempList에 추가
        for(int num : numlist) {
            if(num % n == 0) {
                tempList.add(num);
            }
        }
        
        // 결과를 저장할 배열을 생성, tempList의 크기와 동일한 크기로 설정
        int[] answer = new int[tempList.size()];
        
        // tempList에 저장된 값을 answer 배열로 복사
        for(int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}

// 자릿수 더하기
class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

// OX퀴즈
// 나중에 다시 풀어보기
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        // 각 퀴즈를 순회
        for (int i = 0; i < quiz.length; i++) {
            // 공백으로 구분하여 수식을 분리
            String[] parts = quiz[i].split(" ");
            // X, Y는 정수로 변환하고 연산자와 Z 추출
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            
            // 연산자에 따라 X와 Y의 연산 결과 계산
            int result;
            if (operator.equals("+")) {
                result = X + Y;
            } else { // "-"
                result = X - Y;
            }
            
            // 계산된 결과와 주어진 Z를 비교하여 정답 여부 판단
            if (result == Z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
