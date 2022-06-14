package alex.hlo.interview.problems.number;

public class NumberIssues {

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }

    public static String getFibonacciNumbers(int limitIteration) {
        StringBuilder builder = new StringBuilder();

        int previous1 = 1;
        int previous2 = 1;
        int current;

        for (int i = 3; i < limitIteration; i++) {
            current = previous1 + previous2;

            builder.append(String.format("fibonacci numbers %s + %s = %s\n", previous1, previous2, current));

            previous1 = previous2;
            previous2 = current;
        }

        return builder.toString();
    }
}
