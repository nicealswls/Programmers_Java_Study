import java.util.Scanner;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        
        if (num % n == 0) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}