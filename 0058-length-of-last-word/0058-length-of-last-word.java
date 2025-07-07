class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordsArray = s.trim().split("\\s+");
     ArrayList<String> wordsList = new ArrayList<>();
        for (String word : wordsArray) {
            wordsList.add(word);
        }
          String lastWord = wordsList.get(wordsList.size() - 1);
          return lastWord.length();
    }
}