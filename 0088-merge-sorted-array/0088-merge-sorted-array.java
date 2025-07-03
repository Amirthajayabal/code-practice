class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n)
            merged.add(nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++]);

        while (i < m) merged.add(nums1[i++]);
        while (j < n) merged.add(nums2[j++]);

        for (int k = 0; k < merged.size(); k++)
            nums1[k] = merged.get(k);
    }
    
}