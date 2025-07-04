class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        int result = 0;
        for(int num : list) {
            result ^= num;
        }

        return result;
    }
}