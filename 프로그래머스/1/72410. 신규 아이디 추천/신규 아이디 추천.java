class Solution {
    public String solution(String new_id) {
        String answer = ""; //substring 쓸 때는 empty한지 검사를 꼭 실행
        new_id = new_id.toLowerCase();
        
        new_id = second(new_id);
        
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        if (!new_id.isEmpty() && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if(new_id.length()==0) new_id+="a";
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.substring(14,15).equals(".")){
                new_id = new_id.substring(0,14);
            }
        }
        if(new_id.length()<=2){
            if(new_id.length()==1){
                new_id+=new_id+new_id;
            }else{
                new_id+=new_id.substring(1,2);
            }
        }
        return new_id;
    }
    public String second(String new_id) {
    String[] str = new_id.split("");
    StringBuilder s = new StringBuilder(); // StringBuilder 사용
    for (String id : str) {
        if (id.equals("-") || id.equals("_") || id.equals(".") || Character.isDigit(id.charAt(0)) || Character.isLetter(id.charAt(0))) {
            s.append(id); // 유효한 문자만 추가
        }
    }
    return s.toString(); // 최종 문자열 반환
    }
    
}