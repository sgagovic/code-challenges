package leetcode.studyplan.interview;

import leetcode.studyplan.interview.day2.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day2Test {

    @Test
    public void testRemoveElementExample1(){
        Solution solution = new Solution();
        int nums[] = {3,2,2,3};
        int val = 3;

        int k = solution.removeElement(nums, val);
        Assertions.assertEquals(k, 2);
    }

    @Test
    public void testRemoveElementExample2(){
        Solution solution = new Solution();
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = solution.removeElement(nums, val);
        Assertions.assertEquals(k, 5);
    }


}
