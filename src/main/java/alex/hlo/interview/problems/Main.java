package alex.hlo.interview.problems;

import alex.hlo.interview.problems.number.NumberIssues;
import alex.hlo.interview.problems.string.StringIssues;

import java.util.Arrays;


//-ea
public class Main {

    public static void main(String[] args) {
//        NumberIssues
        assert NumberIssues.isPalindrome(11011);
        assert !NumberIssues.isPalindrome(12031);

        assert Arrays.equals(NumberIssues.getFibonacciNumbers(10), new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34});

        assert NumberIssues.factorial(6) == 720;

        assert Arrays.equals(NumberIssues.getTwoNumbersFromArrayForSum1(new int[] {1, 4, 12, 15, 5, 4}, 19), new int[] { 4, 15 });
        assert Arrays.equals(NumberIssues.getTwoNumbersFromArrayForSum2(new int[] {1, 4, 12, 15, 5, 4}, 19), new int[] { 4, 15 });

//        StringIssues
        assert StringIssues.isPalindrome("pSOSp");
        assert !StringIssues.isPalindrome("1234567");
        assert StringIssues.reverseElementInString("!emit esrever s'tI").equals("It's reverse time!");
    }

}
