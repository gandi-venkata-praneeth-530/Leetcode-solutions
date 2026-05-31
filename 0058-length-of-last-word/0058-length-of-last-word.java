class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        // s.split("");
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]!=' '){
                count++;
            }
            else if(ch[i] == ' '){
                break;
            }
        }
        return count;
    }
}