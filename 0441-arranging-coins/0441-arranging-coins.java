class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long right = n;
        // int count = 1;
        while(low <= right){
            long mid = low+(right-low)/2;
            long k=mid*(mid+1)/2;
            if(k==n){
                return (int)mid;
            }
            else if(k>n){
                right = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)right;
    }
}