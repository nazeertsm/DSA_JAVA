package JavaArrays.sort;

public class ChkArrayisSorted {
    static boolean isSorted(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        //int[] arr = {7, 2, 30, 10};
        int[] arr = {7, 20, 30, 10};
        int n = 4;

        System.out.println(isSorted(arr, n));
    }
}
