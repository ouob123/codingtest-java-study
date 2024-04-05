//Day13
//컨트롤 제트
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split();
        
        for (int i=0; i<str.length; i++){
            if (str[i].equals("Z")){
                answer -= Integer.parseInt(str[i-1]);
                
            } else {
                int num = Integer.parseInt(str[i]);
                answer += num;
            }
        }
        return answer;
    }
}
//배열 원소의 길이
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for (int i=0; i<answer.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
//중복된 문자 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
//삼각형의 완성조건 (1)
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
            
        for (int i=0; i<sides.length - 1; i++){
            for (int j=i+1; j<sides.length; j++){
                if (sides[i] > sides[j]){
                    int temp = sides[j];
                    sides[j] = sides[i];
                    sides[i] = temp;
                }
            }
        }
        
        if (sides[2] < sides[0] + sides[1]){
            answer = 1;
        } else {
            answer = 2;
        }
        
        
        return answer;
    }
}
