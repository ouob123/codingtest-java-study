// 특이한 정렬
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public Integer[] solution(int[] numlist, int n) {
        // int[] 배열을 Integer[] 배열로 변환
        Integer[] numListInteger = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            numListInteger[i] = numlist[i]; // int를 Integer로 박싱
        }
        
        // Comparator를 사용하여 사용자 지정 정렬 규칙을 정의
        Arrays.sort(numListInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 두 수와 n의 차이의 절댓값을 계산
                int diff1 = Math.abs(o1 - n);
                int diff2 = Math.abs(o2 - n);
                
                // 절댓값이 같다면, 두 수를 비교하여 더 큰 수가 앞으로 오도록 함
                if (diff1 == diff2) {
                    return o2 - o1; // 내림차순 정렬
                }
                // 그렇지 않다면, 절댓값이 작은 순으로 정렬
                return diff1 - diff2; // 오름차순 정렬
            }
        });
        
        return numListInteger; // 정렬된 배열 반환
    }
}

// 등수 매기기
class Solution {
    public int[] solution(int[][] score) {
        float[] average = new float[score.length];
        
        for(int i = 0; i < score.length; i++) {
            average[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }
        
        int[] answer = new int[score.length];
        
        for(int j = 0; j < score.length; j++) {
            int count = 1;
            for(int k = 0; k < score.length; k++) {
                if(average[j] < average[k]) count++;
                answer[j] = count;
            }
        }
        
        return answer;
    }
}

// 옹알이 (1)
class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){
                babbling[i] = babbling[i].replace(str[j], " ");
            }
            
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        return answer;
    }
}

// 로그인 성공?
import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
