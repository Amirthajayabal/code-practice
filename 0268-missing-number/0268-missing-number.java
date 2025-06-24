class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!list.contains(i)){
            return i;
            }
        }
    
        return -1;
    }
}