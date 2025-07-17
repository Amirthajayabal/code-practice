class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        class Helper {
            void generate(String current, int open, int close) {
                if (current.length() == n * 2) {
                    result.add(current);
                    return;
                }
                if (open < n)
                    generate(current + "(", open + 1, close);
                if (close < open)
                    generate(current + ")", open, close + 1);
            }
        }

        new Helper().generate("", 0, 0);
        return result;
    }
}