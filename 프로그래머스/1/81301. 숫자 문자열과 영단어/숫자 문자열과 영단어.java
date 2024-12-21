class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch>='0'&&ch<='9'){
                answer.append(ch);
            }else{
                sb.append(ch);
                String temp = sb.toString();
                if (temp.equals("zero")) {
                    answer.append("0");
                    sb.delete(0, sb.length());
                } else if (temp.equals("one")) {
                    answer.append("1");
                    sb.delete(0, sb.length());
                } else if (temp.equals("two")) {
                    answer.append("2");
                    sb.delete(0, sb.length());
                } else if (temp.equals("three")) {
                    answer.append("3");
                    sb.delete(0, sb.length());
                } else if (temp.equals("four")) {
                    answer.append("4");
                    sb.delete(0, sb.length());
                } else if (temp.equals("five")) {
                    answer.append("5");
                    sb.delete(0, sb.length());
                } else if (temp.equals("six")) {
                    answer.append("6");
                    sb.delete(0, sb.length());
                } else if (temp.equals("seven")) {
                    answer.append("7");
                    sb.delete(0, sb.length());
                } else if (temp.equals("eight")) {
                    answer.append("8");
                    sb.delete(0, sb.length());
                } else if (temp.equals("nine")) {
                    answer.append("9");
                    sb.delete(0, sb.length());
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}