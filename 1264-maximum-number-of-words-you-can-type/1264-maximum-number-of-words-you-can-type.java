class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character>name=new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            name.add(c);
        }
        int count=0;
        for(String w:text.split(" ")){
            boolean flag=true;
            for(char c:w.toCharArray()){
                if(name.contains(c)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}