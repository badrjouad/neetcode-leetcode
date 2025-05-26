package easy.arrays;

import java.util.*;

public class FindAllNumberDisapearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {

            set.add(num);

        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result ;
    }
}
