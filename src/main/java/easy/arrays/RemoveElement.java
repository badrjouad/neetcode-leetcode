package easy.arrays;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int k=0;
        int j =0 ;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=val)
            {
              nums[j] = nums[i];
              j++;

            }


        }

        System.out.println(Arrays.toString(nums));

        return j;
    }
}
