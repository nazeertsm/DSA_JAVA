package LeetCode.Dulicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate3 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
// Time Limit Exceeded

    public static void main (String[] args) {
        int[] nums = {1, 4, 6, 6, 7};

        ContainsDuplicate3 obj = new ContainsDuplicate3();
        boolean dupeExist = obj.containsDuplicate(nums);
        System.out.println(dupeExist);


    }
}

