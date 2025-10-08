class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        while (true) {
            int temp = num, product = 1;
            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }
            if (product % t == 0) {
                return num;
            }
            num++;
        }
    }
}