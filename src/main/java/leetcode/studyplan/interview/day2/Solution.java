package leetcode.studyplan.interview.day2;


public class Solution {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] != val){
               nums[index++] = nums[i];
           }
        }

        // After the loop, 'index' will represent the new size of the array
        // Printing the "modified" array
        System.out.print("Modified Array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        return index;

    }
}
