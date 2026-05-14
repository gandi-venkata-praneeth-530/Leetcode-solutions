class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int points=1;
        for(int i=1;i<nums.length;i++){
            if(candidate==nums[i]){
                points+=1;
            }
            else{
                points-=1;
            }
            if(points<=0){
                candidate=nums[i];
                points=1;
            }
        }
        return candidate;
    }
}