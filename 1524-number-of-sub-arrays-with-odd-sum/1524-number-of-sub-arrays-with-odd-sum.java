
class Solution {
    public int numOfSubarrays(int[] arr) {

        int MOD = 1000000007;

        int even = 1;
        int odd = 0;

        int count = 0;
        int prefixParity = 0;

        for (int num : arr) {

            prefixParity = (prefixParity + num) % 2;

            if (prefixParity == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }

            count %= MOD;
        }

        return count;
    }
}
