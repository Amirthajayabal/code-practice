class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char[]c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='6'){
                c[i]='9';
                break;
            }
        }
        String m=new String(c);
        int result=Integer.parseInt(m);
        return result;
    }
}