package Strings;

public class LongestSimilarSubstring {
    public static void main(String[] args) {
        String viratText = "AGGTAB";
        String rohitText = "GXTXAYB";

        int result = longestSimilarSubstring(viratText, rohitText);
        System.out.println("Length of longest similar substring: " + result);
    }

    public static int longestSimilarSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int maxLength = 0;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }
}
