class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int left = 0;
        // int max = 0;
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(map.containsKey(ch)){
        //         left = Math.max(left, map.get(ch)+1);
        //     }
        //     map.put(ch,i);
        //     max = Math.max(max, i-left+1);
        // }
        // return max;
        // int start = 0, end = 0, maxLen=0;
        // List<Character> list = new ArrayList<Character>();
        // while(end<s.length()){
        //     if(!list.contains(s.charAt(end))){
        //         list.add(s.charAt(end));
        //         end++;
        //         maxLen = Math.max(maxLen, list.size());
        //     }
        //     else{
        //         list.remove(Character.valueOf(s.charAt(end)));
        //         start++;
        //     }
        // }
        // return maxLen;
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for(int right = 0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}