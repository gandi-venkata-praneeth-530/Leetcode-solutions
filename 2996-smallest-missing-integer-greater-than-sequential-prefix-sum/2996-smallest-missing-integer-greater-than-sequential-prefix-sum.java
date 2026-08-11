class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==1){
            return nums[nums.length-1]+1;
        }
        for(int num : nums){
            set.add(num);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                while(set.contains(sum)){
                    sum++;
                }
                return sum;
            }
            else{
                sum+=nums[i];
            }
        }
        return sum;
    }
}