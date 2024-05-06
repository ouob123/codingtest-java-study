// 숨어있는 숫자의 덧셈 (2)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 현재 문자 가져오기

            // 현재 문자가 숫자인지 확인
            if (Character.isDigit(ch)) {
                number.append(ch); // 숫자일 경우, number에 추가
            } else {
                // 숫자가 아닌 문자를 만난 경우, 이전까지의 숫자를 합산
                if (number.length() > 0) {
                    answer += Integer.parseInt(number.toString()); // number를 정수로 변환하여 sum에 더함
                    number.setLength(0); // number 초기화
                }
            }
        }
        
        // 마지막에 남은 숫자가 있다면 합산
        if (number.length() > 0) {
            answer += Integer.parseInt(number.toString());
        }

        return answer;
    }
}

// 안전지대
class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        //위험지대 표시할 새로운 배열
        int [][] newBoard =  new int [board.length][board[0].length];

        //지뢰 위치 찾기
        for(int i=0 ; i< board.length; i++){

            for(int j=0 ; j< board[i].length; j++){

                 if(board[i][j]==1){

                     danger(i,j,newBoard);                       
               }        
            }
        }

       //출력
       // printTable(board);
       // printTable(newBoard);

        answer = countDanger(newBoard);

        return answer;
    }

    //지뢰 + 위험 지역 표시
    void danger(int i, int j, int[][] newBoard){

         int overX = newBoard.length;
         int overY = newBoard[0].length;

          newBoard[i][j] = 1;
          if(i > 0) newBoard[i-1][j] =1;
          if(i < overX-1) newBoard[i+1][j] =1;
          if(j < overY-1) newBoard[i][j+1] =1;
          if(j > 0) newBoard[i][j-1] =1;
          if(i > 0 && j>0) newBoard[i-1][j-1] =1;
          if(i < overX-1 && j>0) newBoard[i+1][j-1] =1;
          if(i > 0 && j<overY-1) newBoard[i-1][j+1] =1;
          if(i < overX-1 && j<overY-1) newBoard[i+1][j+1] =1;

    }
    //0 숫자세기
    int countDanger(int[][] board){

        int count =0 ;
        for(int i=0 ; i< board.length; i++){

            for(int j=0 ; j< board[i].length; j++){

                   if(board[i][j]==0){
                        count++;
                 }            
            }
        }

        return count;
    }
}

// 삼각형의 완성조건 (2)
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {	 
        
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
            
        return 2 * sides[0] - 1;
    }
}

// 외계어 사전
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
    	// spell로 이루어진 글자가 있는지 확인하기 위한 변수
        int count = 0;

	// dic의 매개변수 만큼 반복을 시키면서 첫번째 배열 안에 spell이 포함되어 있는지 확인
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
            // 일치하는 spell 이 있을때 마다 증가
                if (dic[i].contains(spell[j])) {
                    count++;
                }
		// dic[i] 한 배열에 spell 개수와 count 값이 같으면 있는것으로 break로 나감
                if(count == spell.length){
                    answer = 1;
                    break;
                }
            }
            count = 0;
        }
        return answer;
    }
}
