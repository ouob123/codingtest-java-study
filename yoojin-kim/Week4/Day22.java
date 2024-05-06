// 저주의 숫자 3
class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for (int i = 0; i < n; i++) {       //매개변수로 들어온 n까지 for문을 돌림
            answer++;                       //일단 answer에 1을 더하고 
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) { //3의 배수거나 "3"을 포함하고 있으면
                answer++;                   //answer를 그 다음 숫자로 넘어감
            }
        }
        return answer;
    }
}

// 평행
class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        int answer = 0;
        
        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;
        
        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y2 - y4) / (x2 - x4);
        if (slope1 == slope2) answer = 1;
        
        slope1 = (double) (y4 - y1) / (x4 - x1);
        slope2 = (double) (y2 - y3) / (x2 - x3);
        if (slope1 == slope2) answer = 1;
        
        return answer;
    }
}

// 겹치는 선분의 길이
class Solution {
    public int solution(int[][] lines) {
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;
        
        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        
        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
    }
  }

// 유한소수 판별하기
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        ArrayList<Integer> resultA = new ArrayList<>();
        ArrayList<Integer> resultB = new ArrayList<>();
        
        int i = 2;
        while (a != 1) {
            if (a % i == 0) {
                resultA.add(i);
                a /= i;
            }
            else i++;
        }
        
        i = 2;
        while (b != 1) {
            if (b % i == 0) {
                resultB.add(i);
                b /= i;
            }
            else i++;
        }
        
        for (Integer num : resultA) {
            if (resultB.contains(num)) resultB.remove(num);
        }
        
        while (resultB.contains(2)) {
            resultB.remove((Integer)2);
        }
        
        while (resultB.contains(5)) {
            resultB.remove((Integer)5);
        }
        
        return resultB.size() == 0 ? 1 : 2;
    }
}
