package easy.arrays;

import java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {


        int count=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();

        for(int n : nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)> nums.length/2)
            {
                return n;
            }
        }




        return -1;

    }
}
