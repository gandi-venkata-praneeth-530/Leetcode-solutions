class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(used[i]) continue;
            List<String> group = new ArrayList<>();

            group.add(strs[i]);
            used[i] = true;

            for(int j = i+1;j<strs.length;j++){

                if(!used[j]&&isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    used[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
    private boolean isAnagram(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c: s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        return map1.equals(map2);
    }
}