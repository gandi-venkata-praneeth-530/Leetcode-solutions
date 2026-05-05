class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }
        int[] res = new int[k];
        int c=0;
        for(int i=bucket.length-1;i>=0&&c<k;i--){
            if(bucket[i]!=null){
                for(Integer b: bucket[i]){
                    res[c++]=b;
                }
            }
        }
        return res;
    }
}