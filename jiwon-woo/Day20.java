//Day20
//직사각형 넓이 구하기
class Solution {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        return w * h;
    }
}
//캐릭터의 좌표
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        int x = board[0]/2;
        int y = board[1]/2;
        
        for (int i=0; i<keyinput.length; i++){
            //up인 경우
            if (keyinput[i].equals("up")){
                if (answer[1] < y){
                    answer[1]++;
                }
            }
            //down인 경우
            else if (keyinput[i].equals("down")){
                if (answer[1] > y * (-1)){
                    answer[1]--;
                }
            }
            //left인 경우
            else if (keyinput[i].equals("left")){
                if (answer[0] > x * (-1)){
                    answer[0]--;
                }
            }
            //right인 경우
            else if (keyinput[i].equals("right")){
                if (answer[0] < x) {
                    answer[0]++;
                }
            }
        }
        return answer;
    }
}
//최댓값 만들기 (2)
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        
        Arrays.sort(numbers);
        
        int max1 = numbers[0] * numbers[1];
        int max2 = numbers[len - 1] * numbers[len - 2];
        
        answer = max2 > max1 ? max2 : max1;
        return answer;
    }
}
//다항식 더하기
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
        
        int a = 0; //x의 계수
        int b = 0; //상수
        
        //루프 돌면서
        for (int i=0; i<str.length; i++){
            //x가 있는 항이면
            if (str[i].contains("x")){
                int len = str[i].length();
                if (len == 1){
                    a += 1;
                } else {
                    String tmp = str[i].substring(0, len-1);
                    a += Integer.parseInt(tmp);
                }
            } else if (str[i].equals("+")){ // + 이면 넘어감
                
            }
            else { //상수항이면 변환해서 더함
                b += Integer.parseInt(str[i]);
            }
        }
        
        if (a == 1 && b == 0){
            answer = "x";
            
        } else if (a == 1 && b != 0){
            answer = "x + " + String.valueOf(b);
        } else if (a != 0 && b == 0){
            answer = String.valueOf(a) + "x";
        } else if (a != 0 && b != 0){
            answer = String.valueOf(a) + "x + " + String.valueOf(b);
        } else {
            answer = String.valueOf(b);
        }
        return answer;
    }
}
