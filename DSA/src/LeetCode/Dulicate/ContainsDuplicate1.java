package LeetCode.Dulicate;

public class ContainsDuplicate1 {

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }
// Time Limit Exceeded

    public static void main (String[] args) {
        int[] nums = {1, 4, 6, 9, 7};

        ContainsDuplicate1 obj = new ContainsDuplicate1();
        boolean dupeExist = obj.containsDuplicate(nums);
        System.out.println(dupeExist);


    }
}

