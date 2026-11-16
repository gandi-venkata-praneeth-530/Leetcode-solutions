class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String res = "";
            String group = "";

            for(int i=0;i<s.length();i++){
                group += s.charAt(i);

                if(group.length()==k){
                    res+=getSum(group);
                    group = "";
                }
            }
            if(!group.isEmpty()){
                res+=getSum(group);
            }
            s= res;
        }
        return s;
    }
    private String getSum(String group){
        int sum = 0;
        for(int i=0;i<group.length();i++){
            sum+=group.charAt(i)-'0';
        }
        return String.valueOf(sum);
    }
}