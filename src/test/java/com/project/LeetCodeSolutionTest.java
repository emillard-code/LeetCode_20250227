package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void lenLongestFibSubseqTest() {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        assertEquals(5, LeetCodeSolution.lenLongestFibSubseq(arr1));

        int[] arr2 = {1,3,7,11,12,14,18};
        assertEquals(3, LeetCodeSolution.lenLongestFibSubseq(arr2));

    }

}
