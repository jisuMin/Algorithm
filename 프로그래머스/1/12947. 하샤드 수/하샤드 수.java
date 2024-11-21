class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String[] num = Integer.toString(x).split("");
        
        for (String result : num) {
            sum += Integer.parseInt(result);
        }
        
        answer = x % sum == 0 ? true : false;
        
        return answer;
    }
}