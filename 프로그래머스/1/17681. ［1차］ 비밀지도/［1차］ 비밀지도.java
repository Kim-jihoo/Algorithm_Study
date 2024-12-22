class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
  
        
        for(int i=0; i<arr1.length; i++){
            String a = String.format("%"+n+"s", Integer.toString(arr1[i], 2)).replace(" ","0");
            String b = String.format("%"+n+"s", Integer.toString(arr2[i], 2)).replace(" ","0");
            String[] str1 = a.split("");
            String[] str2 = b.split("");
            String s = "";
            for(int j=0; j<str1.length; j++){
                if(str1[j].equals("1")||str2[j].equals("1")){
                    s+="#";
                }else{
                    s+=" ";
                }
            }
            answer[i]=s;
            
        }
        
        
        return answer;
    }
}