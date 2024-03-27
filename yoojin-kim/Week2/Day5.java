// 옷 가게 할인 받기
class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }
        
        return answer;
    }
}

// 아이스 아메리카노
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; 
        
        answer[0] = money / 5500; // 개수
        answer[1] = money % 5500; // 남는 돈           
        
        return answer;
    }
}

// 나이 출력
class Solution {
    public int solution(int age) {
        return 2023-age;
    }
}

// 배열 뒤집기
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
         for (int i = 0; i < num_list.length; i++) {
             answer[i] = num_list[num_list.length - 1 - i];        
         }
        
        return answer;
    }
}
