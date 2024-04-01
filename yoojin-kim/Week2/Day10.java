// 점의 위치 구하기
class Solution {
    public int solution(int[] dot) {
        if(dot[0] >0 && dot[1] > 0) return 1;
        else if(dot[0] < 0 && dot[1] > 0) return 2;
        else if(dot[0] < 0 && dot[1] < 0) return 3;
        else return 4;
    }
}

// 2차원으로 만들기
public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int firstDimensionSize = 0;
        
        if (num_list.length % n == 0) {
            firstDimensionSize = num_list.length / n;
        } else{
            firstDimensionSize++;
        }
        
        // 2차원 배열을 초기화
        int[][] result = new int[firstDimensionSize][n];
        
        // num_list의 모든 원소를 순회하며 2차원 배열에 할당
        for (int i = 0; i < num_list.length; i++) {
            result[i / n][i % n] = num_list[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] result = solution.solution(num_list, n);
        
        // 결과 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 공 던지기
class Solution {
     public int solution(int[] numbers, int K) {
        
        int index = ((K - 1) * 2) % numbers.length;
        
        // 해당 인덱스에 있는 사람의 번호를 반환합니다.
        return numbers[index];
    }
}

// 배열 회전시키기
public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        // 회전시킨 배열을 저장할 새로운 배열을 생성
        int[] rotated = new int[length];
        
        if (direction.equals("left")) {
            // 왼쪽으로 회전시킬 경우
            for (int i = 0; i < length; i++) {
                // 첫 번째 원소는 배열의 끝으로 이동
                if (i == 0) {
                    rotated[length - 1] = numbers[0];
                } else {
                    // 나머지 원소들은 한 칸씩 앞으로 이동
                    rotated[i - 1] = numbers[i];
                }
            }
        } else if (direction.equals("right")) {
            // 오른쪽으로 회전시킬 경우
            for (int i = 0; i < length; i++) {
                // 마지막 원소는 배열의 시작으로 이동
                if (i == length - 1) {
                    rotated[0] = numbers[length - 1];
                } else {
                    // 나머지 원소들은 한 칸씩 뒤로 이동
                    rotated[i + 1] = numbers[i];
                }
            }
        }      
        return rotated;
    }
}
