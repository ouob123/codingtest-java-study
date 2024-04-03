// 주사위의 개수
class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;
        return width * length * height;
    }
}

// 합성수 찾기
class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i = 2; i <= n; i++){ // 1은 합성수가 아니므로 2부터 시작
            for(int j = 2; j < i; j++){
                if(i % j == 0) { // i가 j로 나누어 떨어지면, i는 합성수
                    cnt++; // 합성수의 개수 증가
                    break;
                }
            }
        }
        return cnt;
    }
}

// 최댓값 만들기(1)
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}

// 팩토리얼
class Solution {
    public int solution(int n) {
        long fact = 1;
        int i = 1;
        
        // i!이 n을 초과하지 않는 동안 반복
        while (fact <= n) {
            i++;
            fact *= i;
        }
        
        // i!이 n을 초과하는 순간의 i-1이 조건을 만족하는 가장 큰 i
        return i - 1;
    }
}
