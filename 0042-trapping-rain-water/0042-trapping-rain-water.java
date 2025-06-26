class Solution {
    public int trap(int[] height) {
          int n = height.length, res = 0;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        left.put(0, height[0]);
        for (int i = 1; i < n; i++)
            left.put(i, Math.max(height[i], left.get(i - 1)));

        right.put(n - 1, height[n - 1]);
        for (int i = n - 2; i >= 0; i--)
            right.put(i, Math.max(height[i], right.get(i + 1)));

        for (int i = 1; i < n - 1; i++)
            res += Math.min(left.get(i), right.get(i)) - height[i];

        return res;
    }
}