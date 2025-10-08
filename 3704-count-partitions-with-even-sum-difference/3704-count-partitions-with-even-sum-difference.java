class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int diff=0;
        int rightsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum=sum-leftsum;
            diff=leftsum-rightsum;
            if(diff%2==0){
                count++;
            }
        }
        return count;
    }
}