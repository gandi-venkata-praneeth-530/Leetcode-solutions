class Solution {
    public int minimumSwaps(int[] nums) {
        int insertPosition = 0;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        int count=0;
        for(int i=0;i<insertPosition;i++){
            if(nums[i]!=0 && result[i]==0){
                count++;
            }
        }
        return count;
    }
}