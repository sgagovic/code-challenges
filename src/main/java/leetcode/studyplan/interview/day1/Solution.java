package leetcode.studyplan.interview.day1;


public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int newLength = m + n -1;
        int i = m - 1;
        int j = n - 1;
       // int j=0;

        while( i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[newLength--] = nums1[i --];
            } else{
                nums1[newLength--] = nums2[j--];
            }
        }

        // If any elements remain in nums2, copy them
        while (j >= 0) {
            nums1[newLength--] = nums2[j--];
        }
    }
}
