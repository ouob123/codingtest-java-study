// 문자열 뒤집기
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i = my_string.length() - 1; i >= 0; i--){
            answer += arr[i];
        }
        return answer;
    }
}

// 직각삼각형 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
			    for (int j = 0; j < i; j++) {
				    System.out.print("*");
			    }
			    System.out.println();
		    }
    }
}

// 짝수 홀수 개수
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int cnt_even = 0;
        int cnt_odd = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                cnt_even ++;
            } else {
                cnt_odd ++;
            }
        }
        
        answer[0] = cnt_even;
        answer[1] = cnt_odd;
        
        return answer;
    }
}

// 문자 반복 출력하기
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j=0; j<n; j++){ 
                answer += arr[i];     
            }
        }
        return answer;
    }
}
