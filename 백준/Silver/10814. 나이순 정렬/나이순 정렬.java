import java.io.*;
import java.util.*;

class Member{
    int age;
    String name;
    public Member(int age, String name){
        this.age = age;
        this.name=name;
    }
}

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Member[] members = new Member [n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name);
        }
        Arrays.sort(members,(a,b)->{
            if(a.age!=b.age){
                return a.age-b.age;
            }else{
                return 0;
            }
        });
     for(Member member : members){
         System.out.println(member.age+" "+ member.name);
     }
    }
}