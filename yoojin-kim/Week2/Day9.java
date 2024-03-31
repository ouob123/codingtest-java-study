// 개미 군단
class Solution {
    public int solution(int hp) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        num1 = hp / 5;
        num2 = (hp % 5) / 3;
        num3 = ((hp % 5) % 3) / 1;
        
        return num1 + num2 + num3;
    }
}

// 모스부호 (1)
class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");

        StringBuilder stringbuilder = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) stringbuilder.append(Character.toString(i + 'a'));
            }
        }
        return stringbuilder.toString();
    }
}

// 가위 바위 보
class Solution {
    public String solution(String rsp) {
        String result = "";
        
        for(int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if(ch == '2') result += '0';
            else if(ch == '0') result += '5';
            else if(ch == '5') result += '2';
        }
        
        return result;
    }
}

// 구슬을 나누는 경우의 수
class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        for (int i = 0; i < share; i++) {
            answer *= (balls - i); // 분자 계산 - n * (n-1) * ... * (n-m+1)
            answer /= (i + 1); // 분모 계산 - m!
        }
        
        return (int) answer;
    }
}
