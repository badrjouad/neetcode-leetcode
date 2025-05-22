package easy;

public class ConcatenationOfArray {

    public int [] getConcatenation(int[]nums)
    {
        int lengthOfAns = nums.length*2;
        int [] ans = new int[lengthOfAns];

        System.arraycopy(nums,0,ans,0,lengthOfAns/2);
        System.arraycopy(nums,0,ans,lengthOfAns/2,lengthOfAns/2);

        return ans;



    }
}
