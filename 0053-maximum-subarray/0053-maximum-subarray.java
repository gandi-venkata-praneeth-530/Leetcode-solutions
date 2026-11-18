class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0;
        
        // int max=sum;
        // for(int i=0;i<arr.length;i++){
        //     int start=0,end=k;
        //     sum-=arr[start];
        //     start++;
        //     sum+=arr[k];
        //     end++;
        //     max=Math.max(max,sum);
        // }
        // return max;

        int currSum = nums[0], maxSum = nums[0];
        int tempStart = 0, start = 0, end = 0;

        for(int i = 1;i<nums.length;i++){
            // -2,1,-3,4,-1,2,1,-5,4
            //currSum = -2+1 = 1

            if(nums[i]> currSum+nums[i]){
                currSum = nums[i];
                tempStart = i;
            }
            else{
                currSum += nums[i];
            }

            if(currSum > maxSum){
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        return maxSum;
    }
}