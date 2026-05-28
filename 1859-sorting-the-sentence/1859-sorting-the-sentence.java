class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        for(String word: s.split(" ")){
            int lastIndex = word.length()-1;
            int index = word.charAt(lastIndex)-'0';
            String actualWord = word.substring(0,lastIndex);
            map.put(index, actualWord);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,String> hashIndex: map.entrySet()){
            sb.append(hashIndex.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}