class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(nums[j]<nums[i]){
                        count+=1;
                    }
                }
            }
            ans[index]=count;
            index+=1;
        }
        return ans;
    }
}
/* int n =nums.length;
    int[] ans = new int[n];
    int [] counter = new int[100]
    for(int i:nums){
        counter[i]++;
    } 
    for(int i=1;i<=100;i++){
        counter[i] = counter[i]+counter[i-1];
    }
    int index=0;
    for(int i:nums){
        if(i == 0){
            ans[index] = 0;
        }else{
            ans[index]=counter[i-1];
        }
        index++;
    }
    return ans
    */