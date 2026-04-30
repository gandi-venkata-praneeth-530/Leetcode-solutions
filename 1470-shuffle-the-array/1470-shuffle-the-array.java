class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start=0, next=1;
        int[] ans = new int[2*n];
        int i=0,j=n;
        while(i<nums.length&&j<nums.length){
            ans[start]=nums[i];
            ans[next]=nums[j];
            start+=2;
            next+=2;
            i++;
            j++;
        }
        return ans;
    }
}