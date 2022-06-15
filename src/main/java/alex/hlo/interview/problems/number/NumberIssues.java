package alex.hlo.interview.problems.number;

import java.util.HashMap;
import java.util.Map;

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

    public static int[] getFibonacciNumbers(int limitIteration) {
        int[] result = new int[limitIteration];
        int previous1 = 1;
        int previous2 = 1;
        int current;

        result[0] = 0;
        result[1] = previous1;
        result[2] = previous2;

        for (int i = 3; i < limitIteration; i++) {
            current = previous1 + previous2;
            previous1 = previous2;
            previous2 = current;

            result[i] = current;
        }

        return result;
    }

    public static long factorial(int number) {
        long[] valueList = new long[number];
        for (int i = 1; i <= number; i++) {
            valueList[i - 1] = i;
        }

        long factorial = 1;

        for (Long aLong : valueList) {
            factorial *= aLong;
        }

        return factorial;
    }

    public static int[] getTwoNumbersFromArrayForSum1(int[] arr, int needSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == needSum) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }

        return new int[] {};
    }

    public static int[] getTwoNumbersFromArrayForSum2(int[] arr, int needSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = needSum - arr[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[] { arr[i], arr[map.get(temp)] };
            }
        }

        return new int[] {};
    }

}
