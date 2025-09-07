class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>name=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(name.containsKey(c1)){
                if(name.get(c1)!=c2){
                    return false;
                }
            }
                else if(name.containsValue(c2)){
                    return false;
                }
                name.put(c1,c2);
            }
        return true;
    }
}