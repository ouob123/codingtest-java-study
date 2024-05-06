//Day22
//저주의 숫자 3
class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}
//평행
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
//겹치는 선분의 길이
class Solution {
    public int solution(int[][] lines) {
        //기본 선분 -100~100
        int[] rail = new int[200];
        
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        int answer = 0;
        
        for (int value : rail) {
            if (value > 1)
                answer++;
        }
        return answer;
    }
}
//유한소수 판별하기
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result = gcd(a, b);
    
        int aa = a / result;
        int bb = b / result;
    
        while (true){
            if (bb%2 ==0) bb/=2;
            else if (bb % 5 == 0) bb/=5;
            else break;
        }
    
        if (bb==1) answer = 1;
        else answer = 2;
        
        return answer;
    }
    
    int gcd(int a, int b){
        int tmp1 = 0;
        int tmp2 = 0;
        if (a > b) {
            tmp1 = a;
            tmp2 = b;
        } else{
            tmp1 = b;
            tmp2 = a;
        }
    
        while(true){
            int r = tmp1 % tmp2;
            if (r==0) return tmp2;
        
            tmp1 = tmp2;
            tmp2 = r;
        }
    }
}
