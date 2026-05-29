class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            sb.append(ch - 'a'+1);
        }
        int sum = 0;
        for(char ch: sb.toString().toCharArray()){
            sum+=ch-'0';
        }
        for(int i=1;i<k;i++){
            sum  = digitSum(sum);
        }
        return sum;
    }
        private int digitSum(int n){
            int sum = 0;
            while(n>0){
                sum+=n%10;
                n = n/10;
            }
            return sum;
        }
}