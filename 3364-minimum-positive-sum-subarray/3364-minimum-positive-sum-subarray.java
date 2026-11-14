class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
    //     int i = 0, j=i+1;
    //     int minSum = Integer.MAX_VALUE;
    //     int len = (j-i)+1;
    //     if(len>=l && len<=r){
    //         if(i<j){
    //             int sum = nums.get(i)+nums.get(j);
    //             minSum = Math.min(sum, minSum);
    //         }
    //     }
    //     else{
    //         j++;
    //         if(len <l || len >r){
    //             return -1;
    //         }
    //     }
    //     return minSum;
    // }
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums.get(j);
                int len = (j-i)+1;

                if(len > r) break;
                if(len>=l && sum > 0){
                    minSum = Math.min(sum,minSum);
                }
            }
        }
        return minSum == Integer.MAX_VALUE? -1 : minSum;
    }
}