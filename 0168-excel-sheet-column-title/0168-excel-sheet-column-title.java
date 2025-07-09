class Solution {
    public String convertToTitle(int columnNumber) {
         ArrayList<Character> titleList = new ArrayList<>();
        
        while (columnNumber > 0) {
            columnNumber--; // adjust to 0-based index
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            titleList.add(letter);
            columnNumber = columnNumber / 26;
        }
        Collections.reverse(titleList);
        StringBuilder result = new StringBuilder();
        for (char c : titleList) {
            result.append(c);
        }
        
        return result.toString();
    }
}