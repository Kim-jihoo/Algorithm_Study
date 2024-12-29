import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files,(a,b)->{
            String[] parseA = parseFile(a);
            String[] parseB = parseFile(b);
            
            int head = parseA[0].compareToIgnoreCase(parseB[0]);
            if(head!=0){
                return head;
            }
            int numberA = Integer.parseInt(parseA[1]);
            int numberB = Integer.parseInt(parseB[1]);
            if(numberA!=numberB){
                return numberA-numberB;
            }
            return 0;
        });
        return files;
    }
    public String[] parseFile(String file){
        String head="";
        String number ="";
        int i=0;
        while(i<file.length()&&!Character.isDigit(file.charAt(i))){
            head+=file.charAt(i);
            i++;
        }
        while(i<file.length()&&Character.isDigit(file.charAt(i))){
            number+=file.charAt(i);
            i++;
        }
        return new String[]{head,number};
    }
}