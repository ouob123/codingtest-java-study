// 가까운 수
// 풀이 참조
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        // array를 복사하여 정렬
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        // n과 가장 가까운 수를 찾기 위한 변수들 초기화
        int closest = sortedArray[0]; // 가장 가까운 수
        int minDiff = Math.abs(sortedArray[0] - n); // n과의 최소 차이
        
        // 정렬된 배열을 순회하며 n과 가장 가까운 수 찾기
        for (int i = 1; i < sortedArray.length; i++) {
            int currentDiff = Math.abs(sortedArray[i] - n);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff; // 최소 차이 업데이트
                closest = sortedArray[i]; // 가장 가까운 수 업데이트
            }
        }
        
        return closest;
    }
}

// 369게임
import java.util.ArrayList;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        ArrayList<Integer> arrOrder = new ArrayList<>();
        
        while(order > 0) {
            arrOrder.add(order %10);
            order /= 10;
        }
        
        for(int i = 0; i < arrOrder.size(); i++) { // arrOrder.length() X
            if(arrOrder.get(i) % 3 == 0 && arrOrder.get(i) != 0) answer++; // 0 제외
        }

        return answer;
    }
}

// 암호 해독
public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = 0; i < cipher.length(); i++){
            if((i + 1) % code == 0) answer += cipher.charAt(i);
        }
        return answer;
    }
}

// 대문자와 소문자
public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char ch : my_string.toCharArray()) { // 주어진 문자열을 순회
            if(Character.isLowerCase(ch)) {
                // 소문자인 경우 대문자로 변환
                answer.append(Character.toUpperCase(ch));
            } else if(Character.isUpperCase(ch)) {
                // 대문자인 경우 소문자로 변환
                answer.append(Character.toLowerCase(ch));
            } else {
                // 알파벳이 아닌 경우 그대로 추가
                answer.append(ch);
            }
        }       
        return answer.toString();
    }
}
