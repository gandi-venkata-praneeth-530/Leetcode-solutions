class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int left = 0, right =0;
        for(char c : p.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
            char r = s.charAt(right);
            map2.put(r, map2.getOrDefault(r,0)+1);
            if(right-left+1 == p.length()){
                if(map1.equals(map2)){
                    list.add(left);
                }
                char l = s.charAt(left);
                map2.put(l,map2.get(l)-1);
                if(map2.get(l)==0){
                    map2.remove(l);
                }
                left++;
            }
            right++;
        }
        return list;
    }
}