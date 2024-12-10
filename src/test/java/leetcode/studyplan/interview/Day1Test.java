package leetcode.studyplan.interview;

import leetcode.studyplan.interview.day1.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day1Test {

    @Test
    public void testMergeArraysExample1(){
        Solution solution = new Solution();
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int result[] = {1,2,2,3,5,6};

        solution.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(nums1, result);
    }

    @Test
    public void testMergeArraysExample2(){
        Solution solution = new Solution();
        int nums1[] = {1};
        int nums2[] = {0};

        int result[] = {1};

        solution.merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(nums1, result);
    }

    @Test
    public void testMergeArraysExample3(){
        Solution solution = new Solution();
        int nums1[] = {0};
        int nums2[] = {1};

        int result[] = {1};

        solution.merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(nums1, result);
    }
}
