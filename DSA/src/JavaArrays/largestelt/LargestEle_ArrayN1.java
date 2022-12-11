package JavaArrays.largestelt;

//MNR
public class LargestEle_ArrayN1 {

    static int largest (int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }
    public static void main (String[] args) {

        int[] arr = {22, 10, 90, 60, 50};


        System.out.println("Largest element in given array "+ largest(arr, arr.length));

    }
}