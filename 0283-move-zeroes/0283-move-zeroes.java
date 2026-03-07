class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                    int temp=0;
                    nums[i]=temp;
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                else if(nums[j]==0){
                    j+=1;
                }
            }
        }
        // int pos = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[pos] = nums[i];
        //         pos++;
        //     }
        // }

        // while (pos < nums.length) {
        //     nums[pos] = 0;
        //     pos++;
        // }
    }
}