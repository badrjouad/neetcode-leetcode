package easy.arrays;

public class MaximumAscendingSubarray {
    public int maxAscendingSum(int[] nums) {

        int maxSum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                sum=sum+nums[i];
            }
            else{
                sum=nums[i];
            }
            maxSum=Math.max(maxSum,sum);
        }


        return maxSum;
    }
}
