// 컨트롤 제트
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int[] numbers = new int[arr.length];
        int lastNum = -1; // 처음에는 숫자가 없으므로 -1로 초기화
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                if(lastNum >= 0) {
                    answer -= numbers[lastNum]; // 마지막으로 추가된 숫자를 결과값에서 빼고
                    lastNum--; // 마지막 인덱스 제거
                }
            } else {
                int num = Integer.parseInt(arr[i]);
                lastNum++; // 다음 숫자를 저장할 위치를 업데이트
                numbers[lastNum] = num;
                answer += num;
            }
        }        
        return answer;
    }
}

// 배열 원소의 길이
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

// 중복된 문자 제거
// 풀이 참조
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // my_string의 각 문자를 순회
        for(int i = 0; i < my_string.length(); i++){
            String currentChar = String.valueOf(my_string.charAt(i)); // 현재 문자를 문자열로 변환
            // 현재 문자가 answer에 포함되어 있지 않다면 answer에 추가
            if(!answer.contains(currentChar)) {
                answer += currentChar;
            }
        }
        return answer;
    }
}

// 삼각형의 완성조건 (1)
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) return 1;
        else return 2;
    }
}
