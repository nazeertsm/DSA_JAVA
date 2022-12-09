package mytest;

public class ArraySample {

    public static void main (String[] args) {

        int arr1[] = {23,45, 67, 677,8, 9};
        int target = 67;
        int len_arr  = arr1.length;

        for (int i = 0; i < len_arr; i++) {
        if(arr1[i]==target){
            System.out.println(i);
            break;

    }

        }
    }
}
