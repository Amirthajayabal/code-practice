class Solution {
    public int minimumSum(int num) {
        String s=Integer.toString(num);
        int[]arr=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int f=(arr[0]*10)+arr[3];
        int se=(arr[1]*10)+arr[2];
        return f+se;
    }
}