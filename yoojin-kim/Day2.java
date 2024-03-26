// 두 수의 나눗셈
class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000;
        return (int)answer;
    }
}

// 숫자 비교하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        if(num1 == num2) {
            answer = 1;
        }
        else{
            answer = -1;
        }

        return answer;
    }
}

// 분수의 덧셈
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2+numer2 * denom1;
        int denom = denom1 * denom2;

        int max = 0;

        for(int i=1; i <= numer && i <= denom; i++){
            if( numer%i == 0 && denom%i ==0 ){
                max = i;
            }
        }

        numer = numer/max;
        denom = denom/max;

        int[] answer = {numer, denom};

        return answer;
    }
}

// 배열 두 배 만들기
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
