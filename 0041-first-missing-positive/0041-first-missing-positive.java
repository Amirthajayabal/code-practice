class Solution {
    public int firstMissingPositive(int[] nums) {
      HashSet<Integer>name=new HashSet<>();
      for(int val:nums){
        name.add(val);
      }
      for(int j=1;j<=nums.length+1;j++){
      if(!name.contains(j)){
          return j;
      }
      }
      return -1;
    }
}