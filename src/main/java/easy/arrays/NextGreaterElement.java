package easy.arrays;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [ ] result = new int[nums1.length];


        for(int i=0;i<nums1.length;i++)
        {
            boolean found = false;
            int index=-1;

            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==nums1[i])
                {
                    index=j;
                }
            }
            for (int j=index+1;j<nums2.length;j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    found=true;
                    break;
                }
            }

            if(!found)
            {
                result[i]=-1;
            }
        }

        return result;
}
}
