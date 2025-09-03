class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        int n = text1.size();
        int m = text2.size();

        // Create DP table of size (n+1) x (m+1) filled with 0
        vector<vector<int>> dp(n + 1, vector<int>(m + 1, 0));

        // Build the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1[i - 1] == text2[j - 1]) {
                    // characters match → add 1 to diagonal value
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // take max of skipping one char from either string
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Answer is in bottom-right cell
        return dp[n][m];
    }
};