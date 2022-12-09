package mytest;

public class removeDuplicates {

    public static int removedup (int nums[]) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int inserIndex = 1;
        //we skip to next index, if we see duplicate elements
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[inserIndex] = nums[i];
                inserIndex++;
            }

        }

        return inserIndex;

    }


    public static void main (String[] args) {

        //driver code
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLen = removedup(nums);
        // Printing The array elements
        for (int i = 0; i < newLen; i++)
            System.out.print(nums[i] + " ");
    }
}

