class Solution {
    public boolean sumGame(String num) {
      int n = num.length();
        int sumLeft = 0, sumRight = 0;
        int countLeftQ = 0, countRightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);
            if (c == '?') countLeftQ++;
            else sumLeft += c - '0';
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);
            if (c == '?') countRightQ++;
            else sumRight += c - '0';
        }

        int diffSum = sumLeft - sumRight;
        int diffQ = countRightQ - countLeftQ;
        return diffSum * 2 != diffQ * 9;
    }
}