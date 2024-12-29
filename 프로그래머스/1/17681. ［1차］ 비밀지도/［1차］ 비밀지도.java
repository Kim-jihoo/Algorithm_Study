class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int fix = n;
        for(int i=0; i<n; i++){
            String s1 = String.format("%"+fix +"s",Integer.toBinaryString(arr1[i])).replace(' ','0');
            String s2 = String.format("%"+fix+"s",Integer.toBinaryString(arr2[i])).replace(' ','0');
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
}