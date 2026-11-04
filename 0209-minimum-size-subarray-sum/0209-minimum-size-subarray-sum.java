class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum= 0;
        int minLength = Integer.MAX_VALUE;
        for(int right =0; right< nums.length; right++)
        {
            sum+=nums[right];// 3 1 2 4 = 8
            

            while(sum>=target){
                int length = right - left+1;
                minLength = Math.min(minLength, length);
                sum-=nums[left];
                left+=1;          
            }    
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}