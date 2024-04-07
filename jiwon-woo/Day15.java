//Day15
//영어가 싫어요
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        numbers = numbers.replaceAll("zero","0");
        numbers = numbers.replaceAll("one","1");
        numbers = numbers.replaceAll("two","2");
        numbers = numbers.replaceAll("three","3");
        numbers = numbers.replaceAll("four","4");
        numbers = numbers.replaceAll("five","5");
        numbers = numbers.replaceAll("six","6");
        numbers = numbers.replaceAll("seven","7");
        numbers = numbers.replaceAll("eight","8");
        numbers = numbers.replaceAll("nine","9");
        answer = Long.parseLong(numbers);

        return answer;
        
    }
}
//인덱스 바꾸기
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char n1 = my_string.charAt(num1);
        char n2 = my_string.charAt(num2);
        
        char[] ch = my_string.toCharArray();
        
        ch[num1] = n2;
        ch[num2] = n1;

        answer = String.valueOf(ch);
        
        /* 
        for (int i=0; i<my_string.length(); i++){
            if (i == num1){
                answer += n2;
            } else if (i == num2){
                answer += n1;
            } else {
                answer += my_string.charAt(i);
            }
        }*/
        return answer;
    }
}
//한 번만 등장한 문자
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        //정렬을 한 다음
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);      
        
        //하나만 등장 하는지 count
        for (int i=0; i<ch.length;i++){
            int count = 0;
            for (int j=i; j<ch.length; j++){
                if (ch[i] == ch[j]){
                    count+=1;
                    i = j;
                } else {
                    break;
                }
            }
            if (count == 1){
                answer += ch[i];
            }
        }       
        return answer;
    }
}

//약수 구하기
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=1; i<=n/2; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        list.add(n);
        
        answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
