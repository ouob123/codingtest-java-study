//Day19
//7의 개수
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++){
            while (array[i] > 0){
                if (array[i] % 10 == 7){
                    answer++;
                }
                array[i] = array[i] / 10;
            }
        }
        return answer;
    }
}
//잘라서 배열로 저장하기
class Solution{
    public String[] solution(String my_str, int n){
        int cnt = 0;
        if (my_str.length() % n == 0){
            cnt = my_str.length() / n;
        } else {
            cnt = my_str.length() / n + 1;
        }
       
       String[] answer = new String[cnt];

       for(int i = 0; i < cnt; i++){
          int start = n * i;
          int end = 0;
           
          if(start + n >= my_str.length()){
              end = my_str.length();
          } else {
              end = start + n;
          }
          answer[i] = my_str.substring(start, end);
      }
      return answer;
   }
}
//중복된 숫자 개수
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array){
            if (num == n){
                answer++;
            }
        }
        return answer;
    }
}
//머쓱이보다 키 큰 사람
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int num : array){
            if (num > height){
                answer++;
            }
        }
        return answer;
    }
}
