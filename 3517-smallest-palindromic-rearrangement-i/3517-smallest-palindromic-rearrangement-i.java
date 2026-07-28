class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch] = freq[ch]+1;
        }
        String midChar = "";
        StringBuilder firstHalf = new StringBuilder();
        for(int i = 0;i<freq.length;i++){
            if(freq[i]%2!=0){
                midChar = Character.toString((char)i);
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                for(int j=0;j<freq[i]/2;j++){
                    firstHalf.append((char)i);
                }
            }
        }
        String half = firstHalf.toString();
        StringBuilder lastHalf = new StringBuilder(half).reverse();
        lastHalf.toString();
        StringBuilder res = new StringBuilder();
        res.append(half);
        res.append(midChar);
        res.append(lastHalf);
        return res.toString();
        
    }
}