class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> nonZero = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero.add(nums[i]);
            }else{
                nonZero.add(nums[i]);
            }
        }
        nonZero.addAll(zero);
        for(int i=0;i<nums.length;i++){
            nums[i]=nonZero.get(i);
        }
    }
}