package easy;

import java.util.Arrays;

public class MergeAndSortArray {

    public void mergeAndSortInPlace(int[] nums1, int m, int[] nums2, int n)
    {

        int lengthOfNums1 = n+m;


        for (int j = 0; j < n; j++) {
            nums1[m + j] = nums2[j];
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

}
