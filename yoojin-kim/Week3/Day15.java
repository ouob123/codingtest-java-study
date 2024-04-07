// 영어가 싫어요
class Solution {
    public long solution(String numbers) {
        numbers = numbers.replaceAll("zero", "0");
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");
        
        return Long.parseLong(numbers);
    }
}

// 인덱스 바꾸기
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] splitArray = my_string.split("");
        
        String temp = splitArray[num1];
        splitArray[num1] = splitArray[num2];
        splitArray[num2] = temp;
        
        // String.join 메서드를 사용 - 문자열 배열을 다시 하나의 문자열로 조합
        return String.join("", splitArray);
    }
}

// 한 번만 등장한 문자
// 풀이 참조
import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);
        
        StringBuilder answer = new StringBuilder();
        
        // 배열을 순회하면서 한 번만 등장하는 문자 찾기
        for (int i = 0; i < charArray.length; i++) {
            // 현재 문자가 배열의 마지막 문자이거나 다음 문자와 다른 경우
            if (i == charArray.length - 1 || charArray[i] != charArray[i + 1]) {
                // 현재 문자가 배열의 첫 번째 문자이거나 이전 문자와 다른 경우
                if (i == 0 || charArray[i] != charArray[i - 1]) {
                    // 현재 문자를 결과에 추가
                    answer.append(charArray[i]);
                }
            } else {
                // 현재 문자가 다음 문자와 같다면, 다음 문자를 건너뛰기
                i++;
            }
        }
        
        return answer.toString();
    }
}

// 약수 구하기
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                arr.add(i); // 약수를 리스트에 추가
            }
        }
        
        // 리스트의 크기에 맞는 배열을 생성하고, 리스트의 요소들을 배열에 복사
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }       
        return answer;
    }
}
