package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void lengthOfLongestFibonacciSubsequenceTest() {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        assertEquals(5, LeetCodeAttempt.lengthOfLongestFibonacciSubsequence(arr1));

        int[] arr2 = {1,3,7,11,12,14,18};
        assertEquals(3, LeetCodeAttempt.lengthOfLongestFibonacciSubsequence(arr2));

    }

}
