package com.project.attempt;

import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        System.out.println(lengthOfLongestFibonacciSubsequence(arr1));

        int[] arr2 = {1,3,7,11,12,14,18};
        System.out.println(lengthOfLongestFibonacciSubsequence(arr2));

    }

    // This method returns the length of the longest fibonacci subsequence that can be obtained from arr[].
    public static int lengthOfLongestFibonacciSubsequence(int[] arr) {

        // We will keep track of the longest fibonacci subsequence length
        // that has been recorded so far in this int value.
        int maxLength = 0;

        // We will use two for-loops to test out every possible combination
        // for the first two digits in the subsequence, which would in turn
        // would allow us to test for every possible fibonacci subsequence.
        for (int i = 0; i < arr.length; i++) {

            for (int k = i + 1; k < arr.length; k++) {

                // We will test every possible fibonacci subsequence by
                // trying out all combinations for the first two digits.
                LinkedList<Integer> fibonacciList = new LinkedList<>();
                fibonacciList.add(arr[i]);
                fibonacciList.add(arr[k]);

                // We will call a helper method that will complete the
                // fibonacci subsequence and return the length of the result.
                // If the length is greater than int maxLength, we will update
                // int maxLength to the new value.
                int length = generateFibonacci(arr, fibonacciList);
                if (length > maxLength) { maxLength = length; }

            }

        }

        // Finally, we return whatever value of int maxLength that has been achieved.
        return maxLength;

    }

    // This is a helper method that takes an incomplete fibonacci sequence with only the first
    // two digits, and completes that fibonacci subsequence and then finally returns its length.
    private static int generateFibonacci(int[] arr, LinkedList<Integer> fibonacci) {

        // int currentPosition will help us to keep track of where in
        // the original array we are looking through at any given time.
        int currentPosition = 0;

        // This gets us the position in the original array of the
        // second (and latest) digit in the fibonacci subsequence that we are building.
        // As the subsequence must strictly be increasing, we have no need for the digits before it.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fibonacci.get(fibonacci.size()-1)) { currentPosition = i; }
        }

        // This for-loop will append to the subsequence if it detects any further valid digits
        // that can be added from the original array to the subsequence we are currently building.
        for (int i = currentPosition; i < arr.length; i++) {

            if (fibonacci.get(fibonacci.size()-2) + fibonacci.get(fibonacci.size()-1) == arr[i]) {

                fibonacci.add(arr[i]);

            }


        }

        // Finally, the method will return the final size of the
        // final subsequence that resulted from the earlier operations.
        return fibonacci.size();

    }

    // A helper method to check whether an array is a fibonacci sequence or not.
    private static boolean fibonacciCheck(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] + arr[i+1] != arr[i+2]) { return false; }

        }

        return true;

    }

}
