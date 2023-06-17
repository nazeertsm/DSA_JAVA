package LeetCode.Dulicate;

import java.util.Arrays;

public class ContainsDuplicate2 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
// Time Limit Exceeded

    public static void main (String[] args) {
        int[] nums = {1, 4, 6, 6, 7};

        ContainsDuplicate2 obj = new ContainsDuplicate2();
        boolean dupeExist = obj.containsDuplicate(nums);
        System.out.println(dupeExist);


    }
}

