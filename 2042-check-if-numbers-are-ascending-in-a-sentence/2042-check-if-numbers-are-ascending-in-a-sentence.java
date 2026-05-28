class Solution {
    public boolean areNumbersAscending(String s) {
        int myNum = -1;
        for(String word : s.split(" ")){
            if(Character.isDigit(word.charAt(0))){
                int num = Integer.parseInt(word);
                if(num<=myNum){
                    return false;
                }
                myNum = num;
            }
        }
        return true;
    }
}