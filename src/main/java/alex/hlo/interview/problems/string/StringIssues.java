package alex.hlo.interview.problems.string;

public class StringIssues {

    public static boolean isPalindrome(String str) {
        boolean result = false;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char first = chars[i];
            char second = chars[chars.length - (i + 1)];

            if (first == second) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
