class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        Set<Character> banned = new HashSet<>();
        int count=0;
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                if(upper.contains(Character.toUpperCase(c))){
                    upper.remove(Character.toUpperCase(c));
                    banned.add(Character.toUpperCase(c)); 
                    count--;
                }
                if(!lower.contains(c)){
                    lower.add(c);
                }
                
            }
            if(Character.isUpperCase(c)){
                if(!lower.contains(Character.toLowerCase(c))|| banned.contains(c)){
                    banned.add(c);
                    continue;
                }
                else if(!upper.contains(c)){
                    count++;
                    upper.add(c);
                }
            }
        }
        return count;
    }
}
