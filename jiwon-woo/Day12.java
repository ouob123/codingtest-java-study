//Day12
//모음 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //char[] str = my_string.toCharArray();
        String[] str = my_string.split("");
        
        for (String s : str){
            if (s.equals("a") || s.equals("e") || s.equals("i")
               || s.equals("o") || s.equals("u")){
                
            } else {
                answer += s;
            }
        }
        return answer;
    }
}

//문자열 정렬하기 (1)
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (char s : my_string.toCharArray()){
            if (Character.isDigit(s)){
                list.add(s - '0');
            }
        }
        
         int[] arr = new int[list.size()];
        
        for (int i = 0 ; i < list.size() ; i++) 
            arr[i] = list.get(i).intValue();
        
        Arrays.sort(arr);
        
        return arr;
    }
}

//숨어있는 숫자의 덧셈 (1)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (char s : my_string.toCharArray()){
            if (s >= 48 && s <= 57){
                answer += (s - '0');
            }
        }
        return answer;
    }
}

//소인수분해
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {       
        //약수 담을 어레이리스트
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //약수만 구함, for루프 반절만 돌면 효율적임!
        for (int i = 2; i<= n/2; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        list.add(n); //n도 약수니까 넣음
        
        // 소인수만 넣을 어레이리스트
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        // 소인수 판별
        for (int i=0; i<list.size();i++){
            int count = 0;
            
            for (int j=1; j<=list.get(i); j++){
                if (list.get(i) % j == 0)
                    count++;
            }
            
            if (count <= 2){
                list1.add(list.get(i));
            }
            
        }
        
        // 다시 배열로 변환
        int[] answer = new int[list1.size()];
            
        for (int i = 0 ; i < list1.size() ; i++) 
            answer[i] = list1.get(i).intValue();
        
        return answer;
    }
}
