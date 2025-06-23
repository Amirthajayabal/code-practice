class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>value=new ArrayList<>();
           for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
            value.add(nums[i]);
           }
           for(int i=0;i<value.size();i++){
            nums[i]=value.get(i);
           }
           return value.size();
    }
}