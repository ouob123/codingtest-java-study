// 배열 자르기
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        
        for(int i = 0; i < numbers.length; i++){
            if(i == num1){
                int j = 0; // answer 배열의 인덱스를 위한 변수
                for(int k = num1; k <= num2; k++){
                    answer[j++] = numbers[k];
                }
                break;
            }
        }
        return answer;
    }
}

// 외계행성의 나이
class Solution {
    public String solution(int age) {
        // 숫자에 해당하는 알파벳을 저장하는 배열
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String answer = "";
        
        // 남은 숫자가 없을 때까지 반복
        while (age > 0) {
            int num = age % 10;
            // 해당 숫자에 대응하는 알파벳을 문자열의 앞부분에 추가
            answer = alphabet[num] + answer;
            // 이전 자리수 알파벳 변환 시작
            age /= 10;            
        }    
        return answer;
    }
}

// 진로순서 정하기
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++){
            int count = 1; 
            
            for (int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}

// 순서쌍의 개수
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                answer++;
            else
                continue;
        }
        return answer;
    }
}
