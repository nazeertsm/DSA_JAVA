package Hash;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static boolean containsDuplicate (int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) //set doesnot allows duplicates
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main (String[] args) {

        int[] nums = {1, 2, 3, 6};
        System.out.println(containsDuplicate(nums));

    }
}
