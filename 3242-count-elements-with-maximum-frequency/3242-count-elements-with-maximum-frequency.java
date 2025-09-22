class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        boolean[]vis=new boolean[nums.length];
        int[]freq=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(vis[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    vis[j]=true;
                }
            }
            freq[i]=count;
        }
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        int total = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                total += f;
            }
        }
        
        return total;
    }
}