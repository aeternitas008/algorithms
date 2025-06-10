package hardtasks;

class Solution {
    private static int isPalindrom(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return 0;
            left++;
            right--;
        }
        return str.length();
    }

    private static int longestPalindromeSubstring(String str) {
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            maxLen = Math.max(maxLen, expandAroundCenter(str, i, i));   // Нечётная длина
            maxLen = Math.max(maxLen, expandAroundCenter(str, i, i + 1)); // Чётная длина
        }
        return maxLen;
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public int longestPalindrome(String s, String t) {
        int max = 1;

        // Проверяем наибольший палиндром внутри `s` и `t`
        max = Math.max(longestPalindromeSubstring(s), max);
        max = Math.max(longestPalindromeSubstring(t), max);

        // Перебираем ВСЕ подстроки `s` и `t`
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                for (int k = i; k <= s.length(); k++) {  // Выбираем суффикс из s[i:k]
                    for (int l = j; l <= t.length(); l++) {  // Выбираем префикс из t[j:l]
                        String test = s.substring(i, k) + t.substring(j, l);
                        if (!test.isEmpty()) {
                            max = Math.max(isPalindrom(test), max);
                        }
                    }
                }
            }
        }
        return max;
    }
}