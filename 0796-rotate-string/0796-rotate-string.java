class Solution {
    public boolean rotateString(String s, String goal) {
        String res = "";
        if(s.length()==goal.length()){
            res = s+s;
            return res.contains(goal);
        }
        return false;
    }
}