package SOL_2023_02_week3;

public class Q43165 {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        new Q43165().solution(numbers, target);
    }

    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;

        dfs(numbers, 0, target, numbers[0]);
        dfs(numbers, 0, target, -numbers[0]);

        return answer;
    }

    public void dfs(int[] numbers, int idx, int target, int sum) {
        if(idx==numbers.length-1) {
            if(sum==target) answer++;
            return;
        }

        dfs(numbers, idx+1, target, sum+numbers[idx+1]);
        dfs(numbers, idx+1, target, sum-numbers[idx+1]);
    }
}
