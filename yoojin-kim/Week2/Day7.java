// 특정 문자 제거하기
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i = 0; i < my_string.length(); i++){
            if(!arr[i].equals(letter)){
                answer += arr[i];
            }
        }
        return answer;
    }
}

// 각도기
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90){
            answer = 1;
        }
        else if (angle == 90){
            answer = 2;
        }
        else if (angle > 90 && angle < 180){
            answer = 3;
        }
        else if (angle == 180){
            answer = 4;
        }
        return answer;
    }
}

// 양꼬치
class Solution {
    public int solution(int n, int k) {
        if(n < 10) 
            return n * 12000 + k * 2000;
        else
            return n * 12000 + (k - n/10) * 2000;
    }
}

// 짝수의 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                answer += i;
        }
        return answer;
    }
}
