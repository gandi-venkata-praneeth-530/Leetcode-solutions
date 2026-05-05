class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int left=0;
        int right=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(right<s.length&&left<g.length){
            if(g[left]<=s[right]){
                left++;
            }
            right+=1;
        }
        return left;
    }
}