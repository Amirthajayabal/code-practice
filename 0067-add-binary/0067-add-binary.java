class Solution {
    public String addBinary(String a, String b) {
         List<Integer> res = new ArrayList<>();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            res.add(sum % 2);
            carry = sum / 2;
        }

        Collections.reverse(res);
        StringBuilder sb = new StringBuilder();
        for (int bit : res) sb.append(bit);
        return sb.toString();
    }
}