// 편지
class Solution {
    public int solution(String message) {
        return 2 * message.length();
    }
}

// 가장 큰 수 찾기
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        // 초기 가장 큰 수를 배열의 첫 번째 요소로 초기화
        answer[0] = array[0];
        // 가장 큰 수의 인덱스도 0으로 초기화
        int index = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                index = i;
            }
        }
        
        answer[1] = index;

        return answer;
    }
}

// 문자열 계산하기
class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int answer = Integer.parseInt(arr[0]);
        
        // 배열을 순회하며 연산 수행
        for(int i = 1; i < arr.length; i += 2) { // 연산자와 다음 피연산자를 찾기 위해 2씩 증가
            String operator = arr[i];
            int nextNumber = Integer.parseInt(arr[i+1]);
            
            // 연산자에 따라 결과 값에 더하거나 뺌
            if(operator.equals("+")) {
                answer += nextNumber;
            } else if(operator.equals("-")) {
                answer -= nextNumber;
            }
        }
        
        return answer;
    }
}

// 배열의 유사도
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) answer++;
            }
        }
        return answer;
    }
}
