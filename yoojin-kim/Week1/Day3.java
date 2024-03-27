// 나머지 구하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        answer = num1 % num2;
        return answer;
    }
}

// 중앙값 구하기
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
    }
}

// 최빈 값 구하기
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int max_count = 0;
        
        //배열에서의 최대값 구하기
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        
        int count[] = new int[max+1];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        
        for(int i=0; i<count.length; i++){
            if(max_count < count[i]) {
                max_count = count[i];
                answer = i;
            } else if(max_count == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}

// 짝수는 싫어요
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        for(int i=1; i<=n; i++){
           if(i % 2 == 1) {
                answer[i/2] = i;
            } 
        }
        
        return answer;
    }
}
