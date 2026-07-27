class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums.length==2){
                int j=nums.length-1;
                return (nums[i]-1)*(nums[j]-1);
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}