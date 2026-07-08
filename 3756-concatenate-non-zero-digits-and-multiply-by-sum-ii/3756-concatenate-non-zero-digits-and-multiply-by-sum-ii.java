import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                digits.add(s.charAt(i) - '0');
                pos.add(i);
            }
        }

        int n = digits.size();

        long[] pow = new long[n + 1];
        long[] prefNum = new long[n + 1];
        long[] prefSum = new long[n + 1];

        pow[0] = 1;
        for (int i = 1; i <= n; i++)
            pow[i] = (pow[i - 1] * 10) % MOD;

        for (int i = 0; i < n; i++) {
            prefNum[i + 1] = (prefNum[i] * 10 + digits.get(i)) % MOD;
            prefSum[i + 1] = prefSum[i] + digits.get(i);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = lowerBound(pos, queries[i][0]);
            int r = upperBound(pos, queries[i][1]) - 1;

            if (l > r) {
                ans[i] = 0;
                continue;
            }

            int len = r - l + 1;

            long num = (prefNum[r + 1] - prefNum[l] * pow[len] % MOD + MOD) % MOD;
            long sum = prefSum[r + 1] - prefSum[l];

            ans[i] = (int) ((num * sum) % MOD);
        }

        return ans;
    }

    private int lowerBound(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) >= target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int upperBound(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) > target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna