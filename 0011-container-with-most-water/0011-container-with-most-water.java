class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1, max_area=0;
        while(i<j){
            int area = Math.min(height[i], height[j])*(j-i);
            max_area = Math.max(max_area,area);
            if(height[i]<height[j]){
                i+=1;
            }
            else{
                j-=1;
            }
        }
        return max_area;
    }
}