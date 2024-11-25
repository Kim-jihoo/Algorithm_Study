class Solution {
    public String[] solution(String my_str, int n) {
        int size = (my_str.length() + n - 1)/n;
        String[] answer = new String[size];
        for(int i=0; i<size; i++){
            answer[i]="";
        }
        int num = 0;
         for (int k = 0; k < size; k++) {
            // 각 배열 요소에 n개씩 추가
            for (int j = 0; j < n && num < my_str.length(); j++) {
                answer[k] += my_str.charAt(num++);
            }
        }
        return answer;
    }
}