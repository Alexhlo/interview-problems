package alex.hlo.interview.problems;

import alex.hlo.interview.problems.number.NumberIssues;
import alex.hlo.interview.problems.string.StringIssues;


public class Main {

    public static void main(String[] args) {
        //NumberIssues
        print(NumberIssues.isPalindrome(11011));
        print(NumberIssues.getFibonacciNumbers(12));

        //StringIssues
        print(StringIssues.isPalindrome("pSOSp"));
    }


    private static void print(Object obj) {
        System.out.println(obj);
    }

}
