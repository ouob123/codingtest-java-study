//Day21
//숨어있는 숫자의 덧셈 (2)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}
//안전지대
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] list = new int[board.length+2][board.length+2];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 1){
                    for(int a=i;a<=i+2;a++){
                        for(int b=j;b<=j+2;b++){
                            if(list[a][b] != 1){
                                list[a][b] = 2;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 1;i<list.length-1;i++){
            for(int j = 1;j<list.length-1;j++){
                if(list[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
//삼각형의 완성조건 (2)
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int sum = max + min;

        for (int i = 1; i <= sum; i++) {
            if ((i+min) > max && (i+min) <= sum){
                answer++;
            }
        }
        answer += (sum - max)-1;
        
        return answer;
    }
}
//외계어 사전
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int index;
        
        for(int i = 0; i < dic.length; i++) {
            index = 0;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j]))
                    index++;
                if(index == spell.length){
                    answer = 1;
                    break;
                }
                    
            }
        }
        
        return answer;
    }
}
