// 직사각형 넓이 구하기
class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;

        for(int i = 0; i < dots.length; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                if(dots[i][0] == dots[j][0]) { // x 값이 같은 경우
                    height = Math.abs(dots[i][1] - dots[j][1]);
                } else if(dots[i][1] == dots[j][1]) { // y 값이 같은 경우
                    width = Math.abs(dots[i][0] - dots[j][0]);
                }
            }
        }     
        
        return width * height;
    }
}

// 캐릭터의 좌표
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2))
                    answer[0] = -(int)(board[0] / 2);
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2))
                    answer[0] = (int)(board[0] / 2);
            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if(answer[1] > (int)(board[1] / 2))
                    answer[1] = (int)(board[1] / 2);
            } else {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2))
                    answer[1] = -(int)(board[1] / 2);
            } 
        }
        
        return answer;
    }
}

// 최댓값 만들기 (2)
class Solution {
    public int solution(int[] numbers) {
         // 초기 최댓값을 설정
        int answer = -100000000;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int multi = numbers[i] * numbers[j];                
                // 계산한 곱이 현재까지의 최댓값보다 크면 최댓값을 업데이트
                if (multi > answer) {
                    answer = multi;
                }
            }
        }
        
        return answer;
    }
}

// 다항식 더하기
class Solution {
    public String solution(String polynomial) {
        int xCoefficient = 0; // x의 계수
        int constant = 0; // 상수항
        
        // 입력된 다항식을 '+' 기호를 기준으로 항으로 분리
        String[] terms = polynomial.split(" \\+ ");
        
        for(String term : terms) {
            if(term.contains("x")) {
                // 일차 항 처리
                int index = term.indexOf('x');
                if(index == 0) {
                    // 계수가 1인 경우
                    xCoefficient += 1;
                } else {
                    // 그 외 계수 추출
                    xCoefficient += Integer.parseInt(term.substring(0, index));
                }
            } else {
                // 상수항 처리
                constant += Integer.parseInt(term);
            }
        }
        
        // 결과 문자열 조합
        StringBuilder result = new StringBuilder();
        if(xCoefficient != 0) {
            if(xCoefficient > 1) {
                // 계수가 1보다 큰 경우 계수 출력
                result.append(xCoefficient);
            }
            result.append("x");
            if(constant > 0) {
                // 상수항이 있는 경우
                result.append(" + ").append(constant);
            }
        } else if(constant > 0) {
            // 상수항만 있는 경우
            result.append(constant);
        }
        
        return result.toString();
    }
}
