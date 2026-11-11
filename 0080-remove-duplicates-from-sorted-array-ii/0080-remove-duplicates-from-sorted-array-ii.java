class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        // for(int num : nums){
        //     if(i<2||num!=nums[i-2]){
        //         nums[i++]=num;
        //     }


        // }
        // return i;

        int fast = 2, slow=2;

        while(slow <= fast && fast < nums.length){
            if(nums[fast]==nums[slow-2]){
                fast++;
            }
            else{
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }
        }        
        return slow;
    }
}