class Solution {
    public boolean hasAlternatingBits(int n) {

        int prev = n % 2;   // last bit
        n = n / 2;

        while (n > 0) {

            int curr = n % 2;

            if (curr == prev) {
                return false;
            }

            prev = curr;
            n = n / 2;
        }

        return true;
    }
}
