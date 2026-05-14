class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
            
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count+=1;
        //         }
        //     }
        // }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num: nums){
            sum+=num;
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}