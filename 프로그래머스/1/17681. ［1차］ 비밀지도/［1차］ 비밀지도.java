class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; //2진수 변환
        int fix = n;
        for(int i=0; i<n; i++){
            String s1 = binary(arr1[i],n);
            String s2 = binary(arr2[i],n);
            String[] str1 = s1.split("");
            String[] str2 = s2.split("");
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str1.length;j++){
                if(str1[j].equals("1")||str2[j].equals("1")){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i]=sb.toString();
        }
        return answer;
    }
    public String binary(int number, int n){
        StringBuilder sb = new StringBuilder();
        while(number!=0){
            sb.append(number%2);
            number/=2;
        }
        while(sb.length()<n){
            sb.append(0);
        }
        return sb.reverse().toString();
    }
}