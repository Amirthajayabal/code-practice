class Solution {
    public int numSquares(int n) {
         Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0); // base case: 0 needs 0 squares

        for (int i = 1; i <= n; i++) {
            int min = i; // worst case: all 1^2
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, 1 + dp.get(i - j * j));
            }
            dp.put(i, min);
        }
        return dp.get(n);
    
    }
}