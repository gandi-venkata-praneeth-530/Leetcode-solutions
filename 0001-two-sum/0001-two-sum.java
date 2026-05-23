class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();//create hashmap
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i]; //check the difference is there in hashmap
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i}; //if present then return value of that key and current's element index.
            }
            map.put(nums[i],i);// if not then push the current element and its key   
        }
        return new int[] {};//finally return the array
    }
}