class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        k = k % n;
        if(k==0){
            return;
        }
        int j = n-k; //7-3 = 4
        int index=0;
        for(int i = j;i<n;i++){
            res[index++] = nums[i];
        }
        // [5,6,7]
        for(int i=0;i<j;i++){
            res[index] = nums[i];
            index++;
        }
        for(int i=0;i<n;i++){
            nums[i] = res[i];
        }
    }
}