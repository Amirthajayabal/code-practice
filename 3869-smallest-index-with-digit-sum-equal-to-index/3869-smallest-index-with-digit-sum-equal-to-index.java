class Solution {
    public int smallestIndex(int[] nums) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int emp=nums[i];
            int sum=0;
            while(emp>0){
                int dif=emp%10;
                sum+=dif;
                emp/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}