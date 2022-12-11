package JavaArrays.basicArray;

public class BasicArray {

    int searchitem (int[] arr, int target) {
        int len = arr.length;
        int i;
        for (i = 0; i < len; i++) {
            if (arr[i] == target) {
                break;
            }
        }

        return i;
    }


    public static void main (String[] args) {
        int arr[] = {3, 4, 6, 7, 5, 8};
        int target = 4;

        BasicArray ba = new BasicArray();

        int result = ba.searchitem(arr, target);

        System.out.println(result);


    }


}
