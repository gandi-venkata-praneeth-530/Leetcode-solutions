class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        int left = 0, right=0;
        while(right < s2.length()){
            char r = s2.charAt(right);
            map2.put(r, map2.getOrDefault(r,0)+1);
            if(right-left+1 == s1.length()){
                if(map1.equals(map2)){
                    return true;
                }
                char l = s2.charAt(left);
                map2.put(l, map2.get(l)-1);
                if(map2.get(l)==0)
                {
                    map2.remove(l);
                }
                left++;
            }
            right++;
        }
        return false;
    }
}