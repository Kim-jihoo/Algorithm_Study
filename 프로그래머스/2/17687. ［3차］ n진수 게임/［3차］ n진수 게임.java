class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder total = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int num=0;
        while(total.length()<t*m){
            total.append(convertToBase(num++,n));
        }
        for(int i=0; i<t; i++){
            result.append(total.charAt((p - 1) + i * m));

        }
        return result.toString();
    }
    public String convertToBase(int num, int base){
        StringBuilder sb = new StringBuilder();
        if(num==0) return "0";
        while(num>0){
            int a = num%base;
            if(a<10){
                sb.append(a);
            }else{
                sb.append((char)('A'+(a-10)));
            }
            num/=base;
        }
        return sb.reverse().toString();
    }
}