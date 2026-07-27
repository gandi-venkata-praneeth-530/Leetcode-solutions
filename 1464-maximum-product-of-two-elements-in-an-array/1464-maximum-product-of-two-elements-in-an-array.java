class Solution {
    public int maxProduct(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums.length==2){
        //         int j=nums.length-1;
        //         return (nums[i]-1)*(nums[j]-1);
        //     }
        // }
        // Arrays.sort(nums);
        // int n = nums.length;
        // return (nums[n-1]-1)*(nums[n-2]-1);
        int n = nums.length;
        if(n==2){
            return (nums[n-1]-1)*(nums[n-2]-1);
        }
        for(int i=0;i<nums.length;i++){
            if(nums.length==2){
                int j=nums.length-1;
                return (nums[i]-1)*(nums[j]-1);
            }
        }
        // Arrays.sort(nums);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=nums.length-1;i>=0;i--){
            queue.add(nums[i]);
        }
        return (queue.poll()-1)*(queue.poll()-1);
    }
}