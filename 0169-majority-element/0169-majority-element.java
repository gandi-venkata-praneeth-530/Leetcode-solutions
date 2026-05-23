class Solution {
    public int majorityElement(int[] nums) {
        
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //    int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count+=1;
                    
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;
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