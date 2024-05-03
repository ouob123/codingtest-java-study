// 7의 개수
class Solution {
    public int solution(int[] array) {
        int answer = 0; // 7의 개수를 저장할 변수
        
        for (int number : array) {
            // 현재 숫자에서 7의 개수를 세어 count에 더함
            while (number > 0) {
                if (number % 10 == 7) {
                    answer++;
                }
                number /= 10;
            }
        }
        
        // 결과 출력
        return answer;
    }
}

// 잘라서 배열로 저장하기
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        
        if (my_str.length() % n != 0) {
             answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        
        return answer.toArray(new String[0]);
    }
}

// 중복된 숫자 개수
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }

        return answer;
    }
}

// 머쓱이보다 키 큰 사람
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                return array.length - i;
            }
        }

        return 0;
    }
}
