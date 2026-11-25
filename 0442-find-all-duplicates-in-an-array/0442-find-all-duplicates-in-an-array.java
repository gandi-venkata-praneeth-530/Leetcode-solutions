class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);
            if(count==2){
                list.add(num);
            }
        }
        return list;
        
    }
}